package com.longruan.ftpanalysis.mq.model.hjjc;

import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.io.Serializable;

@MsgName(job = "设备文件", filePath = "*_HJDEV_*",sysType=BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.NC_SM_REALTIME_DATA)
public class SensordataInfomation implements Serializable {

    /**
     * 测点id
     */
    private java.lang.Integer sensorId;
    /**
     * 数据类型
     */
    private java.lang.String dataType;
    /**
     * 分站编号
     */
    private java.lang.String subStation;
    /**
     * 分站端子号
     */
    private java.lang.String terminal;
    /**
     * 安装位置
     */
    private java.lang.String location;
    /**
     * 传感器类型
     */
    private java.lang.String sensorType;
    /**
     * 传感器单位
     */
    private java.lang.String unit;
    /**
     * 量程下限
     */
    private java.lang.Double measureMin;
    /**
     * 量程上限
     */
    private java.lang.Double measureMax;
    /**
     * 上限报警门限
     */
    private java.lang.Double upwarnVal;
    /**
     * 上限解报门限
     */
    private java.lang.Double upsafeVal;
    /**
     * 下限报警门限
     */
    private java.lang.Double downWarnVal;
    /**
     * 下限解报门限
     */
    private java.lang.Double downSafeVal;
    /**
     * 上限断电门限
     */
    private java.lang.Double uppowerCutVal;
    /**
     * 上限复电门限
     */
    private java.lang.Double uppowerRestoreVal;
    /**
     * 下限断电门限
     */
    private java.lang.Double downPowercutVal;
    /**
     * 下限复电门限
     */
    private java.lang.Double downPowerrestoreVal;
    /**
     * 断电器编号
     */
    private java.lang.String influence;
    /**
     * 是否重要测点
     */
    private java.lang.Integer important;
    /**
     * 传感器时间
     */
    private String time;
    /**
     * 位置X
     */
    private java.lang.String x;
    /**
     * 位置y
     */
    private java.lang.String y;
    /**
     * 删除标识
     */
    private java.lang.Integer deleteFlag;

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getSubStation() {
        return subStation;
    }

    public void setSubStation(String subStation) {
        this.subStation = subStation;
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

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getMeasureMin() {
        return measureMin;
    }

    public void setMeasureMin(Double measureMin) {
        this.measureMin = measureMin;
    }

    public Double getMeasureMax() {
        return measureMax;
    }

    public void setMeasureMax(Double measureMax) {
        this.measureMax = measureMax;
    }

    public Double getUpwarnVal() {
        return upwarnVal;
    }

    public void setUpwarnVal(Double upwarnVal) {
        this.upwarnVal = upwarnVal;
    }

    public Double getUpsafeVal() {
        return upsafeVal;
    }

    public void setUpsafeVal(Double upsafeVal) {
        this.upsafeVal = upsafeVal;
    }

    public Double getDownWarnVal() {
        return downWarnVal;
    }

    public void setDownWarnVal(Double downWarnVal) {
        this.downWarnVal = downWarnVal;
    }

    public Double getDownSafeVal() {
        return downSafeVal;
    }

    public void setDownSafeVal(Double downSafeVal) {
        this.downSafeVal = downSafeVal;
    }

    public Double getUppowerCutVal() {
        return uppowerCutVal;
    }

    public void setUppowerCutVal(Double uppowerCutVal) {
        this.uppowerCutVal = uppowerCutVal;
    }

    public Double getUppowerRestoreVal() {
        return uppowerRestoreVal;
    }

    public void setUppowerRestoreVal(Double uppowerRestoreVal) {
        this.uppowerRestoreVal = uppowerRestoreVal;
    }

    public Double getDownPowercutVal() {
        return downPowercutVal;
    }

    public void setDownPowercutVal(Double downPowercutVal) {
        this.downPowercutVal = downPowercutVal;
    }

    public Double getDownPowerrestoreVal() {
        return downPowerrestoreVal;
    }

    public void setDownPowerrestoreVal(Double downPowerrestoreVal) {
        this.downPowerrestoreVal = downPowerrestoreVal;
    }

    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public Integer getImportant() {
        return important;
    }

    public void setImportant(Integer important) {
        this.important = important;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
