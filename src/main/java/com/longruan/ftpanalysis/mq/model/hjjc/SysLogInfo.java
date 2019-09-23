package com.longruan.ftpanalysis.mq.model.hjjc;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;


@MsgName(job = "转换日志记录数据", filePath = "*_HJLOG_*", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.NC_COMPANY)
public class SysLogInfo {

    @FieldOrder(order = 1)
    private String S1; //日志生成时间
    @FieldOrder(order = 2)
    private String S2; //记录内容
    @FieldOrder(order = 3)
    private String S3; //操作人
    @FieldOrder(order = 4)
    private String S4; //备注


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
}
