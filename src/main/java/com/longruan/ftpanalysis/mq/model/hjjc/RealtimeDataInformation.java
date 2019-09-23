package com.longruan.ftpanalysis.mq.model.hjjc;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.io.Serializable;

@MsgName(job = "实时数据", filePath = "*_HJSS_*", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.NC_SM_REALTIME_DATA)
public class RealtimeDataInformation implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 数据生成时间
     */
    private String dataTime;
    /**
     * 传感器id
     */
    @FieldOrder(order = 1)
    private String sensorId;

    private String sensorTime;
    /**
     * 当前值
     */
    @FieldOrder(order = 2)
    private String monitorVal;
    /**
     * 状态
     */
    @FieldOrder(order = 3)
    private String sensorStatus;

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorTime() {
        return sensorTime;
    }

    public void setSensorTime(String sensorTime) {
        this.sensorTime = sensorTime;
    }

    public String getMonitorVal() {
        return monitorVal;
    }

    public void setMonitorVal(String monitorVal) {
        this.monitorVal = monitorVal;
    }

    public String getSensorStatus() {
        return sensorStatus;
    }

    public void setSensorStatus(String sensorStatus) {
        this.sensorStatus = sensorStatus != null ? String.format("%08d", Integer.valueOf(Integer.toBinaryString(Integer.valueOf(sensorStatus)))) : sensorStatus;
    }
}
