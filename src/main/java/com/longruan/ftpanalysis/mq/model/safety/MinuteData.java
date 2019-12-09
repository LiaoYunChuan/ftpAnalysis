package com.longruan.ftpanalysis.mq.model.safety;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

@MsgName(job = "分钟数据", filePath = "*AQFZ", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.SENSOR_TJ5DATA)
public class MinuteData extends MsgHead {

    @FieldOrder(order = 5)
    private String station_id; //分站编码
    @FieldOrder(order = 6)
    private String sensor_id; //传感器编码
    @FieldOrder(order = 7)
    private String S7; //传感器监测类型
    @FieldOrder(order = 8)
    private String S8; //监测地点
    @FieldOrder(order = 9)
    private String station_status; //分站运行状态
    @FieldOrder(order = 10)
    private String sensor_status; //传感器运行状态
    @FieldOrder(order = 11)
    private String avg_value; //5 分钟内平均值
    @FieldOrder(order = 12)
    private String max_value; //5 分钟内最大值
    @FieldOrder(order = 13)
    private String max_value_time; //5 分钟内最大值时刻
    @FieldOrder(order = 14)
    private String min_value; //5 分钟内最小值
    @FieldOrder(order = 15)
    private String min_value_time; //5 分钟内最小值时刻
    @FieldOrder(order = 16)
    private String time; //数据生成时间
    @FieldOrder(order = 17)
    private String S17; //备用字段 1
    @FieldOrder(order = 18)
    private String S18; //备用字段 2


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

    public String getStation_status() {
        return station_status;
    }

    public void setStation_status(String station_status) {
        this.station_status = station_status;
    }

    public String getSensor_status() {
        return sensor_status;
    }

    public void setSensor_status(String sensor_status) {
        this.sensor_status = sensor_status;
    }

    public String getAvg_value() {
        return avg_value;
    }

    public void setAvg_value(String avg_value) {
        this.avg_value = avg_value;
    }

    public String getMax_value() {
        return max_value;
    }

    public void setMax_value(String max_value) {
        this.max_value = max_value;
    }

    public String getMax_value_time() {
        return max_value_time;
    }

    public void setMax_value_time(String max_value_time) {
        this.max_value_time = max_value_time;
    }

    public String getMin_value() {
        return min_value;
    }

    public void setMin_value(String min_value) {
        this.min_value = min_value;
    }

    public String getMin_value_time() {
        return min_value_time;
    }

    public void setMin_value_time(String min_value_time) {
        this.min_value_time = min_value_time;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
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
