package com.longruan.ftpanalysis.mq.model;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

@MsgName(job = "测试数据",filePath = "*AQSS", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.NC_SM_REALTIME_DATA)
public class DemoTest {

    @FieldOrder(order = 1)
    private String S1; //
    @FieldOrder(order = 2)
    private String S2; //
    @FieldOrder(order = 3)
    private String S3; //
    @FieldOrder(order = 4)
    private String S4; //
    @FieldOrder(order = 5)
    private String S5; //
    @FieldOrder(order = 6)
    private String S6; //
    @FieldOrder(order = 7)
    private String S7; //
    @FieldOrder(order = 8)
    private String S8; //
    @FieldOrder(order = 9)
    private String S9; //
    @FieldOrder(order = 10)
    private String S10; //
    @FieldOrder(order = 11)
    private String S11; //
    @FieldOrder(order = 12)
    private String S12; //
    @FieldOrder(order = 13)
    private String S13; //
    @FieldOrder(order = 14)
    private String S14; //

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

    public String getS8() {
        return S8;
    }

    public void setS8(String s8) {
        S8 = s8;
    }

    public String getS9() {
        return S9;
    }

    public void setS9(String s9) {
        S9 = s9;
    }

    public String getS10() {
        return S10;
    }

    public void setS10(String s10) {
        S10 = s10;
    }

    public String getS11() {
        return S11;
    }

    public void setS11(String s11) {
        S11 = s11;
    }

    public String getS12() {
        return S12;
    }

    public void setS12(String s12) {
        S12 = s12;
    }

    public String getS13() {
        return S13;
    }

    public void setS13(String s13) {
        S13 = s13;
    }

    public String getS14() {
        return S14;
    }

    public void setS14(String s14) {
        S14 = s14;
    }

}
