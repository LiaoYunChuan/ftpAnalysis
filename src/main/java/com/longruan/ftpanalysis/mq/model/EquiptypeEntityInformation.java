package com.longruan.ftpanalysis.mq.model;

import com.alibaba.fastjson.annotation.JSONField;

public class EquiptypeEntityInformation {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @JSONField(name = "id")
    private java.lang.String id;
    /**
     * 设备类型编号
     */
    @JSONField(name = "category")
    private java.lang.Integer category;
    /**
     * 设备类型名称
     */
    @JSONField(name = "equipmentTypeNum")
    private java.lang.Integer equipmentTypeNum;
    @JSONField(name = "equipmentTypeName")
    private String equipmentTypeName;
    /**
     * 备注
     */
    @JSONField(name = "remark")
    private java.lang.String remark;
    /**
     * 上传标识
     */
    @JSONField(name = "uploadFlag")
    private java.lang.Integer uploadFlag;
    /**
     * 上传时间
     */
    @JSONField(name = "uplaodRemark")
    private java.lang.Long uplaodRemark;
    /**
     * 上传备注
     */
    @JSONField(name = "uploadTime")
    private java.lang.String uploadTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Integer getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(Integer uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public Long getUplaodRemark() {
        return uplaodRemark;
    }

    public void setUplaodRemark(Long uplaodRemark) {
        this.uplaodRemark = uplaodRemark;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }
}
