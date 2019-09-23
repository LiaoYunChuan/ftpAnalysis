package com.longruan.ftpanalysis.mq.model.hjjc;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.FileHead2;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.batch.entity.OtherBody;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.io.Serializable;

@MsgName(job = "设备文件", filePath = "*_HJDEV_*",head = FileHead2.class,sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.NC_SM_REALTIME_DATA)
@OtherBody({
        SensordataInfomation_2.class,SensordataInfomation_3.class,SensordataInfomation_4.class,
        SensordataInfomation_5.class,SensordataInfomation_6.class
})
public class SensordataInfomation implements Serializable {

    @FieldOrder(order = 1)
    private String S1;    //测点编号
    @FieldOrder(order = 2)
    private String S2;    //监测数值类型编码
    @FieldOrder(order = 3)
    private String S3;    //监测类型编码
    @FieldOrder(order = 4)
    private String S4;    //分站号
    @FieldOrder(order = 5)
    private String S5;    //测点名称
    @FieldOrder(order = 6)
    private String S6;    //测点安装位置
    @FieldOrder(order = 7)
    private String S7;    //测点所属区域名称
    @FieldOrder(order = 8)
    private String S8;    //区域位置类型编码
    @FieldOrder(order = 9)
    private String S9;    //测点重要性
    @FieldOrder(order = 10)
    private String S10;    //单位类型
    @FieldOrder(order = 11)
    private String S11;    //量程上限
    @FieldOrder(order = 12)
    private String S12;    //量程下限
    @FieldOrder(order = 13)
    private String S13;    //上限报警门限
    @FieldOrder(order = 14)
    private String S14;    //上限解报门限
    @FieldOrder(order = 15)
    private String S15;    //下限报警门限
    @FieldOrder(order = 16)
    private String S16;    //下限解报门限
    @FieldOrder(order = 17)
    private String S17;    //上限断电门限
    @FieldOrder(order = 18)
    private String S18;    //上限复电门限
    @FieldOrder(order = 19)
    private String S19;    //下限断电门限
    @FieldOrder(order = 20)
    private String S20;    //下限复电门限
    @FieldOrder(order = 21)
    private String S21;    //传感器关联关系
    @FieldOrder(order = 22)
    private String S22;    //测点Y坐标
    @FieldOrder(order = 23)
    private String S23;    //测点X坐标

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

    public String getS19() {
        return S19;
    }

    public void setS19(String s19) {
        S19 = s19;
    }

    public String getS20() {
        return S20;
    }

    public void setS20(String s20) {
        S20 = s20;
    }

    public String getS21() {
        return S21;
    }

    public void setS21(String s21) {
        S21 = s21;
    }

    public String getS22() {
        return S22;
    }

    public void setS22(String s22) {
        S22 = s22;
    }

    public String getS23() {
        return S23;
    }

    public void setS23(String s23) {
        S23 = s23;
    }
}
