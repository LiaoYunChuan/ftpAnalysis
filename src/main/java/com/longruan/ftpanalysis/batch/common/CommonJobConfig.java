package com.longruan.ftpanalysis.batch.common;

import com.longruan.ftpanalysis.batch.config.BatchConfig;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.batch.listener.CommonJobListener;
import com.longruan.ftpanalysis.batch.util.BatchUtil;
import com.longruan.ftpanalysis.mq.send.ISenderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.io.File;

@Configuration
public class CommonJobConfig {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ISenderService iSenderService;

    @Autowired
    BatchConfig batchConfig;

    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Autowired
    JobBuilderFactory jobBuilderFactory;

    @Autowired
    ThreadPoolTaskExecutor taskExecutor;

    /**
     * Job定义，我们要实际执行的任务，包含一个或多个Step
     *
     * @return
     */
    public Job commonJob(Class jobClass) throws Exception {
        MsgName msgName = BatchUtil.getMsgNameAttr(jobClass);

        return jobBuilderFactory
                .get("【"+msgName.job()+"】处理任务")
                .start(commonFlow(jobClass))
                .end()
                .listener(new CommonJobListener())//绑定监听器csvJobListener
                .build();
    }

    public Flow commonFlow(Class jobClass) throws Exception {
        MsgName msgName = BatchUtil.getMsgNameAttr(jobClass);
        String filePath = batchConfig.getSystemPath(msgName.sysType());
        File file = new File(filePath);
        String[] files = file.list();
        if(files!=null&&files.length==0)throw new Exception("该目录下没有企业！");

        FlowBuilder<Flow> flowBuilder = new FlowBuilder<>("统一【"+msgName.job()+"】处理流程");
        FlowBuilder.SplitBuilder<Flow> splitBuilder = flowBuilder.split(new SimpleAsyncTaskExecutor());
        for (String f : files) {
            flowBuilder = splitBuilder.add(
                    new FlowBuilder<Flow>("企业【"+f+"】处理流程")
                        .start(commonStep(f,jobClass))
                        .build()
            );
        }
        return flowBuilder.build();
    }

    /**
     * step步骤，包含ItemReader，ItemProcessor和ItemWriter
     *
     * @return
     */
    public Step commonStep(String stepMark,Class jobClass) throws Exception {
        MsgName msgName = BatchUtil.getMsgNameAttr(jobClass);

        return stepBuilderFactory
                .get("企业【"+stepMark+"】【"+msgName.job()+"】处理步骤")
//                .chunk(5000)//批处理每次提交5000条数据
                .tasklet(new FileTasklet(iSenderService,batchConfig, stepMark,jobClass))
//                .reader(reader(stepMark,jobClass))
////                .processor(processor)  //指定ItemProcessor
//                .faultTolerant()
//                .skip(Exception.class)
//                .skipLimit(1000)         //一共允许跳过200次异常
//                .writer(writer(stepMark,jobClass))//给step绑定writer
////                .faultTolerant()
////                .retry(Exception.class)   // 重试
////                .noRetry(ParseException.class)
////                .retryLimit(1)           //每条记录重试一次
////                .taskExecutor(new SimpleAsyncTaskExecutor()) //设置每个Job通过并发方式执行，一般来讲一个Job就让它串行完成的好
////                .throttleLimit(10)        //并发任务数为 10,默认为4
                .build();
    }
//    public MultiResourceItemReader reader(String stepMark,Class jobClass) throws Exception {
//        return new CommonMultiFileReader(batchConfig, stepMark,jobClass);
//    }
//
//    public ItemWriter writer(String stepMark,Class jobClass) {
//        return new CommonWriter(batchConfig, stepMark,jobClass, iSenderService);
//    }
}
