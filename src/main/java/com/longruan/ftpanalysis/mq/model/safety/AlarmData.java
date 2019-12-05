package com.longruan.ftpanalysis.mq.model.safety;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

import java.util.Date;

@MsgName(job = "报警数据", filePath = "*AQBJ", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.SENSOR_WARNDATA)
public class AlarmData extends MsgHead {

    @FieldOrder(order = 5)
    String station_id;//分站编码
    @FieldOrder(order = 6)
    String sensor_id;//传感器编码
    @FieldOrder(order = 7)
    String sensor_type;//传感器监测类型
    @FieldOrder(order = 8)
    String location;//监测地点
    @FieldOrder(order = 9)
    Integer station_status;//分站状态
    @FieldOrder(order = 10)
    String sensor_status;//传感器状态
    @FieldOrder(order = 11)
    String sensor_data_type;//传感器数据类型
    @FieldOrder(order = 12)
    String warn_type;//分站状态
    @FieldOrder(order = 13)
    String time;//监测时间
    @FieldOrder(order = 14)
    String arg1;//备用字段1
    @FieldOrder(order = 15)
    String arg2;//备用字段2
    Date sensor_time;//传感器时间
    Double warn_val;//报警门限
    Double safe_val;
    Date s_time;
    Date e_time;
    Double max_val;
    Date max_val_time;
    Date min_val_time;
    Double avg_val;
    Double min_val;
    String influence;
    Date insert_time;
    Boolean is_eliminate;
    Date eliminate_time;
    String reason_and_measures;

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

    public String getSensor_data_type() {
        return sensor_data_type;
    }

    public void setSensor_data_type(String sensor_data_type) {
        this.sensor_data_type = sensor_data_type;
    }

    public String getWarn_type() {
        return warn_type;
    }

    public void setWarn_type(String warn_type) {
        this.warn_type = warn_type;
    }

    public String getTime() {
//        try {
//            this.time = DateFormatUtils.format(DateUtils.parseDate(this.time,"yyyy-MM-dd HH:mm:ss"),"yyyy-MM-dd/HH:mm:ss");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        return time;
    }

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

    public Date getSensor_time() {
        return sensor_time;
    }

    public void setSensor_time(Date sensor_time) {
        this.sensor_time = sensor_time;
    }

    public Double getWarn_val() {
        return warn_val;
    }

    public void setWarn_val(Double warn_val) {
        this.warn_val = warn_val;
    }

    public Double getSafe_val() {
        return safe_val;
    }

    public void setSafe_val(Double safe_val) {
        this.safe_val = safe_val;
    }

    public Date getS_time() {
        return s_time;
    }

    public void setS_time(Date s_time) {
        this.s_time = s_time;
    }

    public Date getE_time() {
        return e_time;
    }

    public void setE_time(Date e_time) {
        this.e_time = e_time;
    }

    public Double getMax_val() {
        return max_val;
    }

    public void setMax_val(Double max_val) {
        this.max_val = max_val;
    }

    public Date getMax_val_time() {
        return max_val_time;
    }

    public void setMax_val_time(Date max_val_time) {
        this.max_val_time = max_val_time;
    }

    public Date getMin_val_time() {
        return min_val_time;
    }

    public void setMin_val_time(Date min_val_time) {
        this.min_val_time = min_val_time;
    }

    public Double getAvg_val() {
        return avg_val;
    }

    public void setAvg_val(Double avg_val) {
        this.avg_val = avg_val;
    }

    public Double getMin_val() {
        return min_val;
    }

    public void setMin_val(Double min_val) {
        this.min_val = min_val;
    }

    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public Date getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(Date insert_time) {
        this.insert_time = insert_time;
    }

    public Boolean getIs_eliminate() {
        return is_eliminate;
    }

    public void setIs_eliminate(Boolean is_eliminate) {
        this.is_eliminate = is_eliminate;
    }

    public Date getEliminate_time() {
        return eliminate_time;
    }

    public void setEliminate_time(Date eliminate_time) {
        this.eliminate_time = eliminate_time;
    }

    public String getReason_and_measures() {
        return reason_and_measures;
    }

    public void setReason_and_measures(String reason_and_measures) {
        this.reason_and_measures = reason_and_measures;
    }
}
