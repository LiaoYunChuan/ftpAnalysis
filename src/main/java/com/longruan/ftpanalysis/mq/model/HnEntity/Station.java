package com.longruan.ftpanalysis.mq.model.HnEntity;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

@MsgName(job = "分站数据", filePath = "*AQFC", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.STATION)
public class Station extends MsgHead {

    @FieldOrder(order = 5)
    private String S5; //
    @FieldOrder(order = 6)
    private String S6; //
    @FieldOrder(order = 7)
    private String S7; //
    @FieldOrder(order = 8)
    private String S8; //


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

}
