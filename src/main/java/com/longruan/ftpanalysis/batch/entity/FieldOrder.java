package com.longruan.ftpanalysis.batch.entity;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldOrder {
    String group() default "g1";
    int order();
}
