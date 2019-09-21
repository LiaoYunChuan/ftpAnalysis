package com.longruan.ftpanalysis.mq.model;

import java.io.Serializable;

public class EquipType implements Serializable {
    /**
     * 上级类别编码
     */
    private Integer category;
    /**
     * 设备类型编号
     */
    private java.lang.Integer equipmentTypeNum;
    /**
     * 设备类型名称
     */
    private java.lang.String equipmentTypeName;
    /**
     * 备注
     */
    private java.lang.String remark;

    private Integer deleteFlag;

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getEquipmentTypeNum() {
        return equipmentTypeNum;
    }

    public void setEquipmentTypeNum(Integer equipmentTypeNum) {
        this.equipmentTypeNum = equipmentTypeNum;
    }

    public String getEquipmentTypeName() {
        return equipmentTypeName;
    }

    public void setEquipmentTypeName(String equipmentTypeName) {
        this.equipmentTypeName = equipmentTypeName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
