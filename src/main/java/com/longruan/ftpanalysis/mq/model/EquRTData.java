package com.longruan.ftpanalysis.mq.model;

import java.io.Serializable;

public class EquRTData implements Serializable {
    /**
     * 数据生成时间
     */
    private java.lang.String dataTime;
    /**
     * 设备编号
     */
    private java.lang.Integer equipmentNum;
    /**
     * 出入井标志位
     */
    private java.lang.Integer state;
    /**
     * 入井时刻
     */
    private java.lang.String timeInWell;
    /**
     * 出井时刻
     */
    private java.lang.String timeOutWell;
    /**
     * 区域编码
     */
    private java.lang.Integer areaId;
    /**
     * 进入当前区域时刻
     */
    private java.lang.String timeInArea;
    /**
     * 分站编码
     */
    private java.lang.Integer stationId;
    /**
     * 进入当前所处分站时刻
     */
    private java.lang.String timeInStation;
    /**
     * 状态
     */
    private java.lang.Integer status;

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public Integer getEquipmentNum() {
        return equipmentNum;
    }

    public void setEquipmentNum(Integer equipmentNum) {
        this.equipmentNum = equipmentNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTimeInWell() {
        return timeInWell;
    }

    public void setTimeInWell(String timeInWell) {
        this.timeInWell = timeInWell;
    }

    public String getTimeOutWell() {
        return timeOutWell;
    }

    public void setTimeOutWell(String timeOutWell) {
        this.timeOutWell = timeOutWell;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getTimeInArea() {
        return timeInArea;
    }

    public void setTimeInArea(String timeInArea) {
        this.timeInArea = timeInArea;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getTimeInStation() {
        return timeInStation;
    }

    public void setTimeInStation(String timeInStation) {
        this.timeInStation = timeInStation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
