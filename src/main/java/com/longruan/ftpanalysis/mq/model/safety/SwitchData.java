package com.longruan.ftpanalysis.mq.model.safety;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

@MsgName(job = "开关量参数", filePath = "*AQKC", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.SENSORSWITCH)
public class SwitchData extends MsgHead {


    @FieldOrder(order = 5)
    private String sub_station; //分站编码
    @FieldOrder(order = 6)
    private String sensor_id; //传感器编码
    @FieldOrder(order = 7)
    private String sensor_type; //传感器监测类型
    @FieldOrder(order = 8)
    private String location; //监测地点
    @FieldOrder(order = 9)
    private String area_name; //断电区域
    @FieldOrder(order = 10)
    private String time; //数据生成时间
    @FieldOrder(order = 11)
    private String S11; //备用字段 1
    @FieldOrder(order = 12)
    private String S12; //备用字段 2

    public String getSub_station() {
        return sub_station;
    }

    public void setSub_station(String sub_station) {
        this.sub_station = sub_station;
    }

    public String getSensor_id() {
        return super.getMine_id()+sensor_id;
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
