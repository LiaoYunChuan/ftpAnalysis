package com.longruan.ftpanalysis.mq.model.hjjc;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

@MsgName(job = "开关量分钟状态变化", filePath = "*_HJZT_*", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.NC_COMPANY)
public class SwitchStatusDataInfo {

    @FieldOrder(order = 1)
    private String S1; //测点编号
    @FieldOrder(order = 2)
    private String S2; //当前班次
    @FieldOrder(order = 3)
    private String S3; //第一班值
    @FieldOrder(order = 4)
    private String S4; //第二班值
    @FieldOrder(order = 5)
    private String S5; //第三班值
    @FieldOrder(order = 6)
    private String S6; //第四班值

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
}
