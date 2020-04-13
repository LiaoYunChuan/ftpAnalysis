package com.longruan.ftpanalysis.batch.common;

import com.alibaba.fastjson.JSON;
import com.longruan.ftpanalysis.batch.config.BatchConfig;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.model.MQMsg;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@StepScope
@EnableAsync
public class FileTasklet implements Tasklet {

    Logger log = LoggerFactory.getLogger(this.getClass());

    private final Class dataClz;
    private final RabbitTemplate iSenderService;
    Resource[] resources;
    private final BatchConfig batchConfig;
    private final String stepMark;
    private MsgName msgName;
    private int totalRes = 0;

    public FileTasklet(RabbitTemplate iSenderService, BatchConfig batchConfig, String stepMark, Class clz) throws Exception {
        this.batchConfig = batchConfig;
        this.stepMark = stepMark;
        this.dataClz = clz;
        this.iSenderService = iSenderService;
        this.msgName = (MsgName) clz.getAnnotation(MsgName.class);
        if (this.msgName == null) throw new ClassNotFoundException();
        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        String readPath = "file:" + batchConfig.getSystemPath(msgName.sysType()) + "/" + stepMark + "/" + msgName.filePath();
        this.resources = patternResolver.getResources(readPath);//动态读取资源列表
        totalRes = resources.length;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
        if (resources.length == 0) {
            log.info("【" + stepMark + "】暂无【" + msgName.filePath() + "】文件");
            return RepeatStatus.FINISHED;
        }
        if (resources.length == 1) {
            try {
                processFile(resources[0], 0);
                return RepeatStatus.FINISHED;
            } catch (Exception e) {
                log.error(resources[0].getFilename() + " :  \n" + e.getMessage());
            }
        }
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
                        log.error(r.getFilename() + " :  \n" + e.getMessage());
                    }
                });
        return RepeatStatus.FINISHED;
    }

    @Async
    public void processFile(Resource r, int resIndex) throws Exception {

        ReadableByteChannel channel = null;
        try {
            channel = r.readableChannel();
            ByteBuffer buffer = ByteBuffer.allocate((int) r.contentLength());
            //读取数据
            buffer.clear();
            int length = channel.read(buffer);
            String result = new String(buffer.array(), 0, length, "utf-8");
//            asynWriteFileMethod(r);//日志文件
            asyncRabbitmqMethod(result, resIndex);
        } finally {
            if (channel != null) {
                channel.close();
            }
        }
    }

    @Async
    public void asyncRabbitmqMethod(String result, int resIndex) throws Exception {
        MQMsg mqmsg = CommonFileReader.read(result,dataClz,batchConfig);
        String exchangeName = msgName.exchangeName();
        if (resIndex > 0 && totalRes > 1 && !"".equals(msgName.hisExchangeName())) {
            exchangeName = msgName.hisExchangeName();
        }
        log.info("消息数 ： " + mqmsg.getData().size());
        System.err.println(JSON.toJSONString(mqmsg).getBytes());
//        iSenderService.convertAndSend(exchangeName, "",JSON.toJSONString(mqmsg).getBytes());//发送消息到rabbitmq
    }

    @Async
    public void asynWriteFileMethod(Resource r) {
        try {
            String logBasePath = batchConfig.getLogPath(msgName.sysType()) + "/" + stepMark + "/" + DateFormatUtils.format(new Date(), "yyyy-MM-dd") + "/";
            File file = new File(logBasePath);
            if (!file.exists()) {
                file.mkdirs();
                log.info("日志路径不存在，创建目录");
            }
            Files.move(r.getFile().toPath(), Paths.get(logBasePath + r.getFilename()));
            log.info("输出到日志...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
