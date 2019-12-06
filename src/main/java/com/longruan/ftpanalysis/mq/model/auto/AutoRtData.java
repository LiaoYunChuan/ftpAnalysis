package com.longruan.ftpanalysis.mq.model.auto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.AutoMsgHead;

import java.sql.Timestamp;

@MsgName(job = "自动化传感器实时数据", filePath = "*rtdata", sysType = BatchConstants.SystemType.zdh, exchangeName = MQConstants.ExChanges.AUTO_RTDATA)
public class AutoRtData extends AutoMsgHead {

    @FieldOrder(order = 5)
    private String sensor_id;//传感器编码
    @FieldOrder(order = 6)
    private Double real_value;//监测值
    @FieldOrder(order = 7)
    private Integer sensor_status;//状态
    @FieldOrder(order = 8)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp snap_time;

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public Double getReal_value() {
        return real_value;
    }

    public void setReal_value(Double real_value) {
        this.real_value = real_value;
    }

    public Integer getSensor_status() {
        return sensor_status;
    }

    public void setSensor_status(Integer sensor_status) {
        this.sensor_status = sensor_status;
    }

    public Timestamp getSnap_time() {
        return snap_time;
    }

    public void setSnap_time(Timestamp snap_time) {
        this.snap_time = snap_time;
    }
}
