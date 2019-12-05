package com.longruan.ftpanalysis.batch.common;

import com.alibaba.fastjson.JSON;
import com.longruan.ftpanalysis.batch.config.BatchConfig;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.model.MQMsg;
import com.longruan.ftpanalysis.mq.model.MsgHead;
import com.longruan.ftpanalysis.mq.send.ISenderService;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.mapping.PatternMatchingCompositeLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.BeanUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Component
@StepScope
public class FileTasklet implements Tasklet {

    Logger log = LoggerFactory.getLogger(this.getClass());

    private final Class dataClz;
    private final ISenderService iSenderService;
    Resource[] resources;
    private final BatchConfig batchConfig;
    private final String stepMark;
    private MsgName msgName;
    private int totalRes = 0;

    public FileTasklet(ISenderService iSenderService, BatchConfig batchConfig, String stepMark, Class clz) throws Exception {
        this.batchConfig = batchConfig;
        this.stepMark = stepMark;
        this.dataClz = clz;
        this.iSenderService = iSenderService;
        this.msgName = (MsgName) clz.getAnnotation(MsgName.class);
        if (this.msgName == null) throw new ClassNotFoundException();
        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        String readPath = "file:" + batchConfig.getSystemPath(msgName.sysType()) + "/" + stepMark + "/" + msgName.filePath();
        log.info("读取文件路径: " + readPath);
        this.resources = patternResolver.getResources(readPath);//动态读取资源列表
        if (resources.length == 0) log.info("暂无【" + msgName.filePath() + "】文件");
        totalRes = resources.length;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
        AtomicInteger resIndex = new AtomicInteger();
        List<Resource> rs = Arrays.asList(resources);
        rs.stream()
                .sorted(Comparator.comparing(Resource::getFilename).reversed())
                .forEach(r -> {
                    try {
                        processFile(r, resIndex.get());
                        resIndex.getAndIncrement();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
        return RepeatStatus.FINISHED;
    }

    @Async
    public void processFile(Resource r, int resIndex) throws Exception {

        PatternMatchingCompositeLineMapper lineMapper = new PatternMatchingCompositeLineMapper<>();
        FlatFileItemReader reader = new FlatFileItemReader();
        reader.setResource(r);
        Map<String, LineTokenizer> lineTokenizers = new HashMap<>();
        Map<String, FieldSetMapper> fieldSetMappers = new HashMap<>();

        log.info("读取方式  : ");
        log.info("   dataClz : " + dataClz);
        {
            String[] dataField = getFieldStr(dataClz);
            String dataTokenizers = Arrays.stream(dataField).map(e -> "*").collect(Collectors.joining(";"));
            lineTokenizers.put(dataTokenizers, new DelimitedLineTokenizer(";") {{
                setNames(dataField);
            }});
            fieldSetMappers.put(dataTokenizers, new BeanWrapperFieldSetMapper() {{
                setTargetType(dataClz);
            }});
            log.info("  dataTokenizers : " + dataTokenizers);
            log.info("  dataField : " + JSON.toJSONString(dataField));
        }

        lineMapper.setTokenizers(lineTokenizers);
        lineMapper.setFieldSetMappers(fieldSetMappers);
        reader.setLineMapper(lineMapper);
        reader.open(new ExecutionContext());
        List items = new ArrayList<>();
        MQMsg mQMsg = new MQMsg();
        MsgHead msgHead = new MsgHead();
        int i = 0;
        Object obj = reader.read();
        boolean flag = true;
        while (flag) {
            try {
                obj = reader.read();
                if (obj == null) {
                    flag = false;
                    break;
                } else {
                    items.add(obj);
                    if (i == 0) {
                        BeanUtils.copyProperties(obj, msgHead);
                    }
                    String mineidMapped = batchConfig.mineidMapped(msgHead.getMine_id());
                    if (mineidMapped != null) {
                        Method m = BeanUtils.findMethod(MsgHead.class, "setMine_id", String.class);
                        if (m != null) m.invoke(obj, mineidMapped);
                    }
                    i++;
                }
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }
        reader.close();
        mQMsg.setHead(msgHead);
        mQMsg.setData(items);
        //发送消息
        asyncMethod(mQMsg, resIndex);
        //转移到日志目录
        asynWriteFileMethod(r);
    }

    public static String[] getSelfFieldStr(Class clz) {
        return Arrays.stream(clz.getDeclaredFields()).filter(e -> e.getAnnotation(FieldOrder.class) != null)
                .sorted(Comparator.comparingInt(e -> e.getAnnotation(FieldOrder.class).order()))
                .map(Field::getName).toArray(String[]::new);
    }

    public static String[] getFieldStr(Class clz) {
        return Arrays.stream(FieldUtils.getAllFields(clz)).filter(e -> e.getAnnotation(FieldOrder.class) != null)
                .sorted(Comparator.comparingInt(e -> e.getAnnotation(FieldOrder.class).order()))
                .map(Field::getName).toArray(String[]::new);
    }

    public void asyncMethod(MQMsg mQMsg, int resIndex) throws Exception {

        String exchangeName = msgName.exchangeName();
        if (resIndex > 0 && totalRes > 1 && !"".equals(msgName.hisExchangeName())) {
            exchangeName = msgName.hisExchangeName();
        }
        log.info("消息数 ： " + mQMsg.getData().size());
        log.info("发送路由 ： " + exchangeName);
        iSenderService.send(exchangeName, JSON.toJSONString(mQMsg).getBytes());
    }
    @Async
    public void asynWriteFileMethod(Resource r) {

        try {
            String readPath = "file:" + batchConfig.getSystemPath(msgName.sysType()) + "/" + stepMark + "/" + msgName.filePath();
            String logBasePath = batchConfig.getLogPath(msgName.sysType()) + "/" + stepMark + "/" + DateFormatUtils.format(new Date(), "yyyy-MM-dd") + "/";
            log.info("日志地址 : " + logBasePath);
            File file = new File(logBasePath);
            if (!file.exists()) {
                file.mkdirs();
                log.info("日志路径不存在，创建目录");
            }
            Files.move(r.getFile().toPath(), Paths.get(logBasePath + r.getFilename()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
