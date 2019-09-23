package com.longruan.ftpanalysis.mq.model.hjjc;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.io.Serializable;

@MsgName(job = "模拟量", filePath = "*_HJFZ_*", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.NC_SM_REALTIME_DATA)
public class AnalogDataInfomation implements Serializable {
    @FieldOrder(order = 1)
    private String S1; //测点编号
    @FieldOrder(order = 2)
    private String S2; //分钟时间
    @FieldOrder(order = 3)
    private String S3; //5分钟内统计值平均值
    @FieldOrder(order = 4)
    private String S4; //5分钟内统计值最大值
    @FieldOrder(order = 5)
    private String S5; //5分钟内统计值最大值时刻
    @FieldOrder(order = 6)
    private String S6; //5分钟内统计值最小值
    @FieldOrder(order = 7)
    private String S7; //5分钟内统计值最小值时刻


    public String getS1() {
        return S1;
    }

    public void setS1(String s1) {
        S1 = s1;
    }

    public String getS2() {
        return S2;
    }

    public void setS2(String s2) {
        S2 = s2;
    }

    public String getS3() {
        return S3;
    }

    public void setS3(String s3) {
        S3 = s3;
    }

    public String getS4() {
        return S4;
    }

    public void setS4(String s4) {
        S4 = s4;
    }

    public String getS5() {
        return S5;
    }

    public void setS5(String s5) {
        S5 = s5;
    }

    public String getS6() {
        return S6;
    }

    public void setS6(String s6) {
        S6 = s6;
    }

    public String getS7() {
        return S7;
    }

    public void setS7(String s7) {
        S7 = s7;
    }
}
