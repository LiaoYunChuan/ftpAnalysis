package com.longruan.ftpanalysis.mq.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class SbrealtimedataInformation {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @JSONField(name = "id")
    private java.lang.String id;
    /**
     * 数据生成时间
     */
    @JSONField(name = "dataTime")
    private java.util.Date dataTime;
    /**
     * 设备编号
     */
    @JSONField(name = "equipmentNum")
    private java.lang.String equipmentNum;
    /**
     * 出入井标志位
     */
    @JSONField(name = "state")
    private java.lang.String state;
    /**
     * 入井时刻
     */
    @JSONField(name = "timeInWell")
    private java.util.Date timeInWell;
    /**
     * 出井时刻
     */
    @JSONField(name = "timeOutWell")
    private java.util.Date timeOutWell;
    /**
     * 区域编码
     */
    @JSONField(name = "areaId")
    private java.lang.String areaId;
    /**
     * 进入当前区域时刻
     */
    @JSONField(name = "timeInArea")
    private java.util.Date timeInArea;
    /**
     * 分站编码
     */
    @JSONField(name = "stationId")
    private java.lang.String stationId;
    /**
     * 进入当前所处分站时刻
     */
    @JSONField(name = "timeInStation")
    private java.util.Date timeInStation;
    /**
     * 状态
     */
    @JSONField(name = "status")
    private java.lang.String status;
    /**
     * 上传标识
     */
    @JSONField(name = "uploadFlag")
    private java.lang.Long uploadFlag;
    /**
     * 上传时间
     */
    @JSONField(name = "uploadTime")
    private java.util.Date uploadTime;
    /**
     * 上传备注
     */
    @JSONField(name = "uploadRemark")
    private java.lang.String uploadRemark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getEquipmentNum() {
        return equipmentNum;
    }

    public void setEquipmentNum(String equipmentNum) {
        this.equipmentNum = equipmentNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getTimeInWell() {
        return timeInWell;
    }

    public void setTimeInWell(Date timeInWell) {
        this.timeInWell = timeInWell;
    }

    public Date getTimeOutWell() {
        return timeOutWell;
    }

    public void setTimeOutWell(Date timeOutWell) {
        this.timeOutWell = timeOutWell;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Date getTimeInArea() {
        return timeInArea;
    }

    public void setTimeInArea(Date timeInArea) {
        this.timeInArea = timeInArea;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public Date getTimeInStation() {
        return timeInStation;
    }

    public void setTimeInStation(Date timeInStation) {
        this.timeInStation = timeInStation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(Long uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadRemark() {
        return uploadRemark;
    }

    public void setUploadRemark(String uploadRemark) {
        this.uploadRemark = uploadRemark;
    }
}
