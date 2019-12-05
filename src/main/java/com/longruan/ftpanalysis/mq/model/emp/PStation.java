package com.longruan.ftpanalysis.mq.model.emp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.sql.Timestamp;

@MsgName(job = "人员分站数据", filePath = "*RYFZ", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_PSTATION)
public class PStation {

    @FieldOrder(order = 1)
    private String	mine_id;//煤矿编码 +1
    @FieldOrder(order = 2)
    private Integer gid;//序号+ 2
    @FieldOrder(order = 3)
    private String point_type;//类型，分站或轨迹点+ 3
    @FieldOrder(order = 4)
    private String 	station_id;//分站编码+4
    @FieldOrder(order = 5)
    private String	v_name;//分站名称+5
    @FieldOrder(order = 6)
    private String	v_lng;//经度+6
    @FieldOrder(order = 7)
    private String	v_lat;//纬度 + 7
    @FieldOrder(order = 8)
    private String position_note;//注释+ 8

    public String getMine_id() {
        return mine_id;
    }

    public void setMine_id(String mine_id) {
        this.mine_id = mine_id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getPoint_type() {
        return point_type;
    }

    public void setPoint_type(String point_type) {
        this.point_type = point_type;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getV_lng() {
        return v_lng;
    }

    public void setV_lng(String v_lng) {
        this.v_lng = v_lng;
    }

    public String getV_lat() {
        return v_lat;
    }

    public void setV_lat(String v_lat) {
        this.v_lat = v_lat;
    }

    public String getPosition_note() {
        return position_note;
    }

    public void setPosition_note(String position_note) {
        this.position_note = position_note;
    }
}
