package com.longruan.ftpanalysis.batch.entity;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MsgName {

    String job();
    String exchangeName();
    String filePath();
    String sysType();
    Class head() default FileHead.class;
}
