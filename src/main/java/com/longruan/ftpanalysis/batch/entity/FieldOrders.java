package com.longruan.ftpanalysis.batch.entity;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldOrders {
    FieldOrder[] value();

    String name() default "";
}
