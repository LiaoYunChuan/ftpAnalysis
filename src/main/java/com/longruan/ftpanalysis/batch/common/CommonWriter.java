package com.longruan.ftpanalysis.batch.common;

import com.alibaba.fastjson.JSON;
import com.longruan.ftpanalysis.batch.config.BatchConfig;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.model.MQMsg;
import com.longruan.ftpanalysis.mq.model.MsgHead;
import com.longruan.ftpanalysis.mq.send.ISenderService;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.batch.item.ItemWriter;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.scheduling.annotation.Async;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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
        asynWriteFileMethod();

        //发送消息
        asyncMethod(items);
    }

    @Async
    public void asynWriteFileMethod() {

        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = new Resource[0];//动态读取资源列表
        try {

            String readPath = "file:" + batchConfig.getSystemPath(msgName.sysType()) + "/" + stepMark + "/" + msgName.filePath();
            String logBasePath = batchConfig.getLogPath(msgName.sysType()) + "/" + stepMark + "/Log." + DateFormatUtils.format(new Date(), "yyyy-MM-dd") + "/";
            resources = patternResolver.getResources(readPath);
            System.err.println("日志地址 : " + logBasePath);
            File file = new File(logBasePath);
            System.err.println(file.exists());
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
    public void asyncMethod(List items) throws Exception {

        Class headClass = msgName.head();
        MQMsg mQMsg = new MQMsg();
        List data = new ArrayList<>();
        String dataTime = "";
        MsgHead msgHead = new MsgHead();
        Method getCompanyId = headClass.getMethod("getCompanyId");
        Method getDataTime = headClass.getMethod("getDataTime");
        Method setDataTime = jobClass.getMethod("setDataTime", String.class);

        for (Object e : items) {
            if (e.getClass().equals(headClass)) {
                String companyid = (String) getCompanyId.invoke(e);
                String orgCode = batchConfig.getOrgCode(companyid);
                msgHead.setOrgCode(orgCode);
                msgHead.setCompanyId(companyid);
                dataTime = (String) getDataTime.invoke(e);
            } else {
                setDataTime.invoke(e, dataTime);
                data.add(e);
            }
        }
        msgHead.setUpTime(DateFormatUtils.format(new Date(), "yyyy-MM-dd hh:mm:dd"));
        mQMsg.setHead(msgHead);
        mQMsg.setData(data);
        System.err.println("头数据 ： ");
        System.err.println(JSON.toJSONString(msgHead));
        System.err.println("请求体 ： " + data.size());
        System.err.println(JSON.toJSONString(data));
        //iSenderService.send(msgName.exchangeName(), JSON.toJSONString(msg).getBytes());
    }
}
