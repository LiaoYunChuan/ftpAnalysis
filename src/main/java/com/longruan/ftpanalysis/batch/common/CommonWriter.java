package com.longruan.ftpanalysis.batch.common;

import com.alibaba.fastjson.JSON;
import com.longruan.ftpanalysis.batch.config.BatchConfig;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.model.MQMsg;
import com.longruan.ftpanalysis.mq.model.MsgHead;
import com.longruan.ftpanalysis.mq.send.ISenderService;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.BeanUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.scheduling.annotation.Async;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

public class CommonWriter implements ItemWriter {

    private final ISenderService iSenderService;
    private final BatchConfig batchConfig;
    private final Class jobClass;
    private final String stepMark;
    private MsgName msgName;

    public CommonWriter(BatchConfig batchConfig, String stepMark, Class jobClass, ISenderService iSenderService) {
        this.batchConfig = batchConfig;
        this.jobClass = jobClass;
        this.iSenderService = iSenderService;
        this.stepMark = stepMark;
    }

    @Override
    public void write(List items) throws Exception {
        this.msgName = (MsgName) jobClass.getAnnotation(MsgName.class);
        if (msgName == null) throw new ClassNotFoundException();

        //转移到日志目录
//         asynWriteFileMethod();

        //发送消息
        asyncMethod(items);
    }

    @Async
    public void asynWriteFileMethod() {

        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = new Resource[0];//动态读取资源列表
        try {

            String readPath = "file:" + batchConfig.getSystemPath(msgName.sysType()) + "/" + stepMark + "/" + msgName.filePath();
            String logBasePath = batchConfig.getLogPath(msgName.sysType()) + "/" + stepMark + "/" + DateFormatUtils.format(new Date(), "yyyy-MM-dd") + "/";
            resources = patternResolver.getResources(readPath);
            System.err.println("日志地址 : " + logBasePath);
            File file = new File(logBasePath);
            if (!file.exists()) {
                file.mkdirs();
                System.err.println("日志路径不存在，创建目录");
            }
            for (Resource r : resources) {
                Files.move(r.getFile().toPath(), Paths.get(logBasePath + r.getFilename()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Async
    public void asyncMethod(List<? extends MsgHead> items) throws Exception {


        MQMsg mQMsg = new MQMsg();
        MsgHead msgHead = new MsgHead();
        if (items.size() > 0) {
            String mineidMapped = batchConfig.mineidMapped(items.get(0).getMine_id());
            if(mineidMapped!=null){
                items.stream().forEach(e->
                    e.setMine_id(mineidMapped)
                );
            }
            BeanUtils.copyProperties(items.get(0), msgHead);
        }

        mQMsg.setHead(msgHead);
        mQMsg.setData(items);
        System.err.println("消息 ： " + items.size());
        System.err.println(JSON.toJSONString(mQMsg));
        System.err.println("发送路由 ： " + msgName.exchangeName());
        iSenderService.send(msgName.exchangeName(), JSON.toJSONString(mQMsg).getBytes());
    }
}
