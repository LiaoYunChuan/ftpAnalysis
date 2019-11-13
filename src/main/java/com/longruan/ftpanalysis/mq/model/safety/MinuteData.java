package com.longruan.ftpanalysis.mq.model.safety;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

@MsgName(job = "分钟数据", filePath = "*AQFZ", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.SENSOR_TJ5DATA)
public class MinuteData extends MsgHead {

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
    @FieldOrder(order = 15)
    private String S15; //
    @FieldOrder(order = 16)
    private String S16; //
    @FieldOrder(order = 17)
    private String S17; //
    @FieldOrder(order = 18)
    private String S18; //


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

    public String getS15() {
        return S15;
    }

    public void setS15(String s15) {
        S15 = s15;
    }

    public String getS16() {
        return S16;
    }

    public void setS16(String s16) {
        S16 = s16;
    }

    public String getS17() {
        return S17;
    }

    public void setS17(String s17) {
        S17 = s17;
    }

    public String getS18() {
        return S18;
    }

    public void setS18(String s18) {
        S18 = s18;
    }
}
