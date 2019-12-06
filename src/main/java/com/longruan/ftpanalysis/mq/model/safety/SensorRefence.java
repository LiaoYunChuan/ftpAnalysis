package com.longruan.ftpanalysis.mq.model.safety;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

@MsgName(job = "测点关系数据", filePath = "*AQGX", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.SENSORREF)
public class SensorRefence extends MsgHead {

    @FieldOrder(order = 5)
    private String station_id; //分站编码
    @FieldOrder(order = 6)
    private String sensor_id; //传感器编码
    @FieldOrder(order = 7)
    private String to_station_id; //关联分站编码
    @FieldOrder(order = 8)
    private String to_sensor_id; //关联传感器编码
    @FieldOrder(order = 9)
    private String sensor_relation; //关系类型
    @FieldOrder(order = 10)
    private String time; //数据生成时间
    @FieldOrder(order = 11)
    private String S11; //备用字段 1
    @FieldOrder(order = 12)
    private String S12; //备用字段 2


    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getSensor_id() {
        return super.getMine_id()+sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getTo_station_id() {
        return to_station_id;
    }

    public void setTo_station_id(String to_station_id) {
        this.to_station_id = to_station_id;
    }

    public String getTo_sensor_id() {
        return to_sensor_id;
    }

    public void setTo_sensor_id(String to_sensor_id) {
        this.to_sensor_id = to_sensor_id;
    }

    public String getSensor_relation() {
        return sensor_relation;
    }

    public void setSensor_relation(String sensor_relation) {
        this.sensor_relation = sensor_relation;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
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
}
