package com.longruan.ftpanalysis.mq.model;

import com.alibaba.fastjson.annotation.JSONField;

public class EquipinformationInformation {
    private static final long serialVersionUID = 1L;
    @JSONField(name = "id")
    private java.lang.String id;
    /**
     * 设备类型编号
     */
    @JSONField(name = "equipmentTypeNum")
    private java.lang.Integer equipmentTypeNum;
    /**
     * 设备编号
     */
    @JSONField(name = "equipmentNum")
    private java.lang.String equipmentNum;
    /**
     * 设备名称
     */
    @JSONField(name = "equipmentName")
    private java.lang.String equipmentName;
    /**
     * 定位卡
     */
    @JSONField(name = "cardId")
    private java.lang.String cardId;
    /**
     * 设备司机
     */
    @JSONField(name = "driver")
    private java.lang.String driver;
    /**
     * 所属部门
     */
    @JSONField(name = "department")
    private java.lang.String department;
    /**
     * 终端ip
     */
    @JSONField(name = "terminalIp")
    private java.lang.String terminalIp;
    /**
     * 上传时间
     */
    @JSONField(name = "uploadTime")
    private java.lang.Long uploadTime;
    /**
     * 上传标识
     */
    @JSONField(name = "uoloadFlag")
    private java.lang.Integer uoloadFlag;
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

    public Integer getEquipmentTypeNum() {
        return equipmentTypeNum;
    }

    public void setEquipmentTypeNum(Integer equipmentTypeNum) {
        this.equipmentTypeNum = equipmentTypeNum;
    }

    public String getEquipmentNum() {
        return equipmentNum;
    }

    public void setEquipmentNum(String equipmentNum) {
        this.equipmentNum = equipmentNum;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTerminalIp() {
        return terminalIp;
    }

    public void setTerminalIp(String terminalIp) {
        this.terminalIp = terminalIp;
    }

    public Long getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Long uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getUoloadFlag() {
        return uoloadFlag;
    }

    public void setUoloadFlag(Integer uoloadFlag) {
        this.uoloadFlag = uoloadFlag;
    }

    public String getUploadRemark() {
        return uploadRemark;
    }

    public void setUploadRemark(String uploadRemark) {
        this.uploadRemark = uploadRemark;
    }
}
