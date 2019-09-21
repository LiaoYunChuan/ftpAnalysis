package com.longruan.ftpanalysis.mq.model;

import java.io.Serializable;

public class EquInfo implements Serializable {
    /**
     * 设备子类型编号
     */
    private java.lang.Integer equipmentTypeNum;
    /**
     * 设备编号
     */
    private java.lang.Integer equipmentNum;
    /**
     * 设备名称
     */
    private java.lang.String equipmentName;
    /**
     * 定位卡
     */
    private java.lang.Integer cardId;
    /**
     * 设备司机
     */
    private java.lang.String driver;
    /**
     * 所属部门
     */
    private java.lang.String department;
    /**
     * 终端ip
     */
    private java.lang.String terminalIp;
    /**
     * 设备类型
     */
    private java.lang.Integer category;

    public Integer getEquipmentTypeNum() {
        return equipmentTypeNum;
    }

    public void setEquipmentTypeNum(Integer equipmentTypeNum) {
        this.equipmentTypeNum = equipmentTypeNum;
    }

    public Integer getEquipmentNum() {
        return equipmentNum;
    }

    public void setEquipmentNum(Integer equipmentNum) {
        this.equipmentNum = equipmentNum;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
