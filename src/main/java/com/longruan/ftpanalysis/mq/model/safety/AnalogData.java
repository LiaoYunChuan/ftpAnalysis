package com.longruan.ftpanalysis.mq.model.safety;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

@MsgName(job = "模拟量数据", filePath = "*AQMC", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.SENSORMC)
public class AnalogData extends MsgHead {

    @FieldOrder(order = 5)
    private String station_id; //分站编码
    @FieldOrder(order = 6)
    private String sensor_id; //传感器编码
    @FieldOrder(order = 7)
    private String sensor_data_type; //传感器监测类型
    @FieldOrder(order = 8)
    private String terminal; //传感器设置地点编号
    @FieldOrder(order = 9)
    private String location; //监测地点
    @FieldOrder(order = 10)
    private String unit; //单位
    @FieldOrder(order = 11)
    private String measure_min; //量程下限
    @FieldOrder(order = 12)
    private String measure_max; //量程上限
    @FieldOrder(order = 13)
    private String up_warn_val; //报警值
    @FieldOrder(order = 14)
    private String up_power_cut_val; //断电值
    @FieldOrder(order = 15)
    private String up_power_restore_val; //复电值
    @FieldOrder(order = 16)
    private String area_name; //断电区域
    @FieldOrder(order = 17)
    private String time; //数据生成时间
    @FieldOrder(order = 18)
    private String S18; //备用字段 1
    @FieldOrder(order = 19)
    private String S19; //备用字段 2


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

    public String getSensor_data_type() {
        return sensor_data_type;
    }

    public void setSensor_data_type(String sensor_data_type) {
        this.sensor_data_type = sensor_data_type;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMeasure_min() {
        return measure_min;
    }

    public void setMeasure_min(String measure_min) {
        this.measure_min = measure_min;
    }

    public String getMeasure_max() {
        return measure_max;
    }

    public void setMeasure_max(String measure_max) {
        this.measure_max = measure_max;
    }

    public String getUp_warn_val() {
        return up_warn_val;
    }

    public void setUp_warn_val(String up_warn_val) {
        this.up_warn_val = up_warn_val;
    }

    public String getUp_power_cut_val() {
        return up_power_cut_val;
    }

    public void setUp_power_cut_val(String up_power_cut_val) {
        this.up_power_cut_val = up_power_cut_val;
    }

    public String getUp_power_restore_val() {
        return up_power_restore_val;
    }

    public void setUp_power_restore_val(String up_power_restore_val) {
        this.up_power_restore_val = up_power_restore_val;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
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
}
