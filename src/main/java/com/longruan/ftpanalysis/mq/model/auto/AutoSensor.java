package com.longruan.ftpanalysis.mq.model.auto;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.AutoMsgHead;

@MsgName(job = "自动化传感器参数", filePath = "*dev*", sysType = BatchConstants.SystemType.zdh, exchangeName = MQConstants.ExChanges.AUTO_DEV)
public class AutoSensor extends AutoMsgHead {

    @FieldOrder(order = 5)
    private String sensor_id;//传感器编码
    @FieldOrder(order = 6)
    private String sensor_name;//监测地点
    @FieldOrder(order = 7)
    private String sensor_type;//传感器名称
    @FieldOrder(order = 8)
    private String sensor_data_type;//传感器监测类型
    @FieldOrder(order = 9)
    private String unit;
    @FieldOrder(order = 10)
    private String measure_min; //量程下限
    @FieldOrder(order = 11)
    private String measure_max; //量程上限
    @FieldOrder(order = 12)
    private String remark1;
    @FieldOrder(order = 13)
    private String remark2;

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

    public String getSensor_data_type() {
        return sensor_data_type;
    }

    public void setSensor_data_type(String sensor_data_type) {
        this.sensor_data_type = sensor_data_type;
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

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }
}
