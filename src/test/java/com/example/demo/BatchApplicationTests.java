package com.example.demo;

import com.longruan.ftpanalysis.FmftpApplication;
import com.longruan.ftpanalysis.batch.common.CommonJobConfig;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.model.auto.AutoRtData;
import com.longruan.ftpanalysis.mq.model.auto.AutoSensor;
import com.longruan.ftpanalysis.mq.model.emp.PersonRtData;
import com.longruan.ftpanalysis.mq.model.emp.PersonTrace;
import com.longruan.ftpanalysis.mq.model.emp_new.PersonRealDevSync;
import com.longruan.ftpanalysis.mq.model.emp_new.PersonRealSync;
import com.longruan.ftpanalysis.mq.model.emp_new.PersonTraceSync;
import com.longruan.ftpanalysis.mq.model.safety.AlarmData;
import com.longruan.ftpanalysis.mq.model.safety.RealTimeData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Async;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FmftpApplication.class)
public class BatchApplicationTests {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    CommonJobConfig commonJobConfig;
//    @Autowired
//    @Qualifier("commonJob")
//    private Job commonJob;

//    @Autowired
//    @Qualifier("taskExecutor")
//    ThreadPoolTaskExecutor taskExecutor;

    @Test
    public void contextLoads() {
    }


    @Test
    public void testHjss() throws Exception {
//        method(AlarmData.class);//正常2 添加唯一键
//        method(AnalogData.class);//正常2  sensor添加唯一键
//        method(CumulantData.class);//正常2
//        method(MinuteData.class);//无数据
//        method(AutoRtData.class);//正常2
//        method(AutoSensor.class);//正常2
//        method(SensorRefence.class);//正常2  添加唯一键
//        method(Station.class);//正常2
//        method(SwitchData.class);//正常2
       // method(PersonRtData.class);//正常2
           //method(PersonRealSync.class);
            //method(PersonRealDevSync.class);
            //method(PersonTraceSync.class);
    }

    @Async
    public void method(Class jobClass) throws Exception {
        MsgName msgName = (MsgName) jobClass.getAnnotation(MsgName.class);
        JobParameters jobParameters2 = new JobParametersBuilder()
                .addLong("jobTime", System.currentTimeMillis())
                .addString("jobName", msgName.job())
                .toJobParameters();
        jobLauncher.run(commonJobConfig.commonJob(jobClass), jobParameters2);
    }
}
