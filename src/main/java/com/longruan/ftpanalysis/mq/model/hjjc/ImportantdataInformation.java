package com.longruan.ftpanalysis.mq.model.hjjc;

import com.alibaba.fastjson.annotation.JSONField;

public class ImportantdataInformation {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @JSONField(name = "id")
    private java.lang.String id;
    /**
     * 传感器编号
     */
    @JSONField(name = "sensorid")
    private java.lang.String sensorid;
    /**
     * 是否重要测点
     */
    @JSONField(name = "isimportant")
    private java.lang.Integer isimportant;

    @JSONField(name = "uploadflag")
    private java.lang.Integer uploadflag;
    /**
     * 上传时间
     */
    @JSONField(name = "uploadtime")
    private java.lang.Long uploadtime;
    /**
     * 上传备注
     */
    @JSONField(name = "uploadremark")
    private java.lang.String uploadremark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSensorid() {
        return sensorid;
    }

    public void setSensorid(String sensorid) {
        this.sensorid = sensorid;
    }

    public Integer getIsimportant() {
        return isimportant;
    }

    public void setIsimportant(Integer isimportant) {
        this.isimportant = isimportant;
    }

    public Integer getUploadflag() {
        return uploadflag;
    }

    public void setUploadflag(Integer uploadflag) {
        this.uploadflag = uploadflag;
    }

    public Long getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Long uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getUploadremark() {
        return uploadremark;
    }

    public void setUploadremark(String uploadremark) {
        this.uploadremark = uploadremark;
    }
}
