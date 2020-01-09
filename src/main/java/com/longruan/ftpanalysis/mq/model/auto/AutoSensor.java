package com.longruan.ftpanalysis.mq.model.auto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.AutoMsgHead;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 抽采泵
 */
@MsgName(job = "自动化传感器参数", filePath = "*dev*", sysType = BatchConstants.SystemType.zdh, exchangeName = MQConstants.ExChanges.AUTO_DEV)
public class AutoSensor extends AutoMsgHead {

    @FieldOrder(order = 5)
    private String sensor_id;//传感器编码
    @FieldOrder(order = 6)
    private String sensor_name;//监测地点
    @FieldOrder(order = 7)
    private String sensor_type;//传感器类型
    @FieldOrder(order = 8)
    private String point_type;//传感器监测类型
    @FieldOrder(order = 9)
    private String unit;
    @FieldOrder(order = 10)
    private String measure_min; //量程下限
    @FieldOrder(order = 11)
    private String measure_max; //量程上限
    @FieldOrder(order = 12)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private String time_str;
    private Timestamp time;
    @FieldOrder(order = 13)
    private String remark;
    private String point_cat="0";

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getSensor_name() {
        return sensor_name;
    }

    public void setSensor_name(String sensor_name) {
        this.sensor_name = sensor_name;
    }

    public String getSensor_type() {
        return sensor_type;
    }

    public void setSensor_type(String sensor_type) {
        this.sensor_type = sensor_type;
    }

    public String getPoint_type() {
        return point_type;
    }

    public void setPoint_type(String point_type) {
        this.point_type = point_type;
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

    public String getTime_str() {
        return time_str;
    }

    public void setTime_str(String time_str) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.time_str = time_str;
        this.time=Timestamp.valueOf(sdf2.format(sdf1.parse(time_str)));

    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPoint_cat() {
        return point_cat;
    }

    public void setPoint_cat(String point_cat) {
        if(null==point_cat){
            point_cat="0";
        }
        this.point_cat = point_cat;
    }
}
