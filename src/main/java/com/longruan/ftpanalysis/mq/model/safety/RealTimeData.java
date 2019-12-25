package com.longruan.ftpanalysis.mq.model.safety;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

@MsgName(job = "实时数据", filePath = "*AQSS", hisExchangeName = MQConstants.ExChanges.SENSOR_RTDATA_HIS,sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.REALTIME_DATA)
public class RealTimeData extends MsgHead {

    @FieldOrder(order = 5)
    private String station_id;//分站编码
    @FieldOrder(order = 6)
    private String sensor_id;//传感器编码
    @FieldOrder(order = 7)
    private String sensor_type;//传感器监测类型
    @FieldOrder(order = 8)
    private String location;//监测地点
    @FieldOrder(order = 9)
    private Integer station_status;//分站状态
    @FieldOrder(order = 10)
    private String sensor_status;//传感器状态
    @FieldOrder(order = 11)
    private String monitor_val;//监测值
    @FieldOrder(order = 12)
    private String time;//监测时间
    @FieldOrder(order = 13)
    private String arg1;
    @FieldOrder(order = 14)
    private String arg2;

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getSensor_type() {
        return sensor_type;
    }

    public void setSensor_type(String sensor_type) {
        this.sensor_type = sensor_type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getStation_status() {
        return station_status;
    }

    public void setStation_status(Integer station_status) {
        this.station_status = station_status;
    }

    public String getSensor_status() {
        return sensor_status;
    }

    public void setSensor_status(String sensor_status) {
        this.sensor_status = sensor_status;
    }

    public String getMonitor_val() {
        return monitor_val;
    }

    public void setMonitor_val(String monitor_val) {
        this.monitor_val = monitor_val;
    }


    @Override
    public String getTime() {
        return time;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

//    public Boolean hasFomatTime=false;
//
//    public Boolean hasFomatTime() {
//        return this.hasFomatTime;
//    }
}
