//package com.longruan.ftpanalysis.batch.common;
//
//
//import com.longruan.ftpanalysis.batch.entity.MsgName;
//import com.longruan.ftpanalysis.mq.model.safety.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.batch.core.JobParameters;
//import org.springframework.batch.core.JobParametersBuilder;
//import org.springframework.batch.core.launch.JobLauncher;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//
//import java.util.Date;
//
//@Configuration
//@EnableScheduling
//public class CommonSchedule {
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    private JobLauncher jobLauncher;
//
//    @Autowired
//    CommonJobConfig commonJobConfig;
//
//    @Async
//    public void method(Class jobClass) throws Exception {
//        MsgName msgName = (MsgName) jobClass.getAnnotation(MsgName.class);
//        JobParameters jobParameters2 = new JobParametersBuilder()
//                .addLong("jobTime", System.currentTimeMillis())
//                .addString("jobName", msgName.job())
//                .toJobParameters();
//        jobLauncher.run(commonJobConfig.commonJob(jobClass), jobParameters2);
//    }
//
//    @Scheduled(fixedRate = 100000)
//    public void readAnalogData() {
//        logger.info(new Date() + "   读取模拟量测点信息");
//        try {
//            method(AnalogData.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Scheduled(fixedRate = 100000)
//    public void readSwitchData() {
//        logger.info(new Date() + "   读取开关量测点信息");
//        try {
//            method(SwitchData.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Scheduled(fixedRate = 5000)
//    public void readRealtimeData() {
//        logger.info(new Date() + "   读取传感器实时信息");
//        try {
//            method(RealTimeData.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Scheduled(fixedRate = 5000)
//    public void readAlarmData() {
//        logger.info(new Date() + "   读取报警数据信息");
//        try {
//            method(AlarmData.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    @Scheduled(fixedRate = 100000)
//    public void readSensorRefence() {
//        logger.info(new Date() + "   读取传感器关系信息");
//        try {
//            method(SensorRefence.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Scheduled(fixedRate = 50000)
//    public void readCumulantData() {
//        logger.info(new Date() + "   读取传感器累积量信息");
//        try {
//            method(CumulantData.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Scheduled(fixedRate = 50000)
//    public void readStation() {
//        logger.info(new Date() + "   读取分站信息");
//        try {
//            method(Station.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    @Scheduled(fixedRate = 60000)
//    public void readMinuteData() {
//        logger.info(new Date() + "   读取传感器分钟数据信息");
//        try {
//            method(MinuteData.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
