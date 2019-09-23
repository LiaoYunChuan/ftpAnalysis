package com.example.demo;

import com.longruan.ftpanalysis.FmftpApplication;
import com.longruan.ftpanalysis.batch.common.CommonJobConfig;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.model.DemoTest;
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
//        method(SensordataInfomation.class);
//        method(CompanyInfomation_new.class);

        method(DemoTest.class);
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
