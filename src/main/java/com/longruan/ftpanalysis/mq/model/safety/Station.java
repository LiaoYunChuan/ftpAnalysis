package com.longruan.ftpanalysis.mq.model.safety;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

import java.sql.Timestamp;

@MsgName(job = "分站数据", filePath = "*AQFC", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.STATION)
public class Station extends MsgHead {


    @FieldOrder(order = 5)
    String station_id;//分站
    @FieldOrder(order = 6)
    String location;//监测地点
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    Timestamp snap_time;//监测时间
    @FieldOrder(order = 7)
    private String arg1; //
    @FieldOrder(order = 8)
    private String agr2; //


    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Timestamp getSnap_time() {
        return snap_time;
    }

    public void setSnap_time(Timestamp snap_time) {
        this.snap_time = snap_time;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public String getAgr2() {
        return agr2;
    }

    public void setAgr2(String agr2) {
        this.agr2 = agr2;
    }
}
