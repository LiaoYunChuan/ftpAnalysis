package com.longruan.ftpanalysis.batch.config;

import com.alibaba.fastjson.JSON;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.Map;

@Configuration("batchConfig")
@PropertySource("classpath:application.properties")
public class BatchConfig {


    @Value("${msg.file.hjjc.path}")
    private String aqjcPath;

    @Value("${msg.file.rydw.path}")
    private String rydwPath;

    @Value("${msg.file.log.hjjc.basepath}")
    private String logHjjcPath;

    @Value("${msg.file.log.rydw.basepath}")
    private String logRydwPath;

    @Value("${msg.mineid.mapper}")
    private String mineids;

    private Map<String,String> mineidMap;

    @Bean
    public void setmineidMap() {
        this.mineidMap = JSON.parseObject(this.mineids,Map.class);
    }

    public String mineidMapped(String id){
        return this.mineidMap.get(id);
    }

    @Bean
    public ThreadPoolTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(1);
        taskExecutor.setMaxPoolSize(20);
        taskExecutor.setKeepAliveSeconds(10);
//        taskExecutor.setAllowCoreThreadTimeOut();
//        taskExecutor.setQueueCapacity(200);
        return taskExecutor;
    }

    public String getLogHjjcPath() {
        return logHjjcPath;
    }

    public String getLogRydwPath() {
        return logRydwPath;
    }

    public String getAqjcPath() {
        return aqjcPath;
    }

    public String getRydwPath() {
        return rydwPath;
    }

    public String getSystemPath(String type) throws Exception {
        switch (type) {
            case BatchConstants.SystemType.hjjc:
                return getAqjcPath();
            case BatchConstants.SystemType.rydw:
                return getRydwPath();
        }
        throw new Exception("【" + type + "】 不属于 BatchConstants.SystemType");
    }

    public String getLogPath(String type) throws Exception {
        switch (type) {
            case BatchConstants.SystemType.hjjc:
                return getLogHjjcPath();
            case BatchConstants.SystemType.rydw:
                return getLogRydwPath();
        }
        throw new Exception("【" + type + "】 不属于 BatchConstants.SystemType");
    }

}


