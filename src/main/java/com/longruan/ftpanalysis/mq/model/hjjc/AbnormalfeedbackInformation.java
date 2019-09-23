package com.longruan.ftpanalysis.mq.model.hjjc;

import com.alibaba.fastjson.annotation.JSONField;

public class AbnormalfeedbackInformation {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @JSONField(name = "id")
    private String id;
    /**
     * 报警数据id
     */
    @JSONField(name = "alarmid")
    private String alarmid;
    /**
     * 反馈状态
     */
    @JSONField(name = "replystatus")
    private Integer replystatus;
    /**
     * 反馈时间
     */
    @JSONField(name = "replytime")
    private Long replytime;
    /**
     * 反馈人
     */
    @JSONField(name = "replyperson")
    private String replyperson;
    /**
     * 反馈责任人
     */
    @JSONField(name = "replyrespperson")
    private String replyrespperson;
    /**
     * 反馈备注
     */
    @JSONField(name = "replyremark")
    private String replyremark;
    /**
     * 上传标识
     */
    @JSONField(name = "uoloadflag")
    private Integer uoloadflag;
    /**
     * 上传备注
     */
    @JSONField(name = "uploadremark")
    private String uploadremark;
    /**
     * 上传时间
     */
    @JSONField(name = "uploadtime")
    private Long uploadtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlarmid() {
        return alarmid;
    }

    public void setAlarmid(String alarmid) {
        this.alarmid = alarmid;
    }

    public Integer getReplystatus() {
        return replystatus;
    }

    public void setReplystatus(Integer replystatus) {
        this.replystatus = replystatus;
    }

    public Long getReplytime() {
        return replytime;
    }

    public void setReplytime(Long replytime) {
        this.replytime = replytime;
    }

    public String getReplyperson() {
        return replyperson;
    }

    public void setReplyperson(String replyperson) {
        this.replyperson = replyperson;
    }

    public String getReplyrespperson() {
        return replyrespperson;
    }

    public void setReplyrespperson(String replyrespperson) {
        this.replyrespperson = replyrespperson;
    }

    public String getReplyremark() {
        return replyremark;
    }

    public void setReplyremark(String replyremark) {
        this.replyremark = replyremark;
    }

    public Integer getUoloadflag() {
        return uoloadflag;
    }

    public void setUoloadflag(Integer uoloadflag) {
        this.uoloadflag = uoloadflag;
    }

    public String getUploadremark() {
        return uploadremark;
    }

    public void setUploadremark(String uploadremark) {
        this.uploadremark = uploadremark;
    }

    public Long getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Long uploadtime) {
        this.uploadtime = uploadtime;
    }
}
