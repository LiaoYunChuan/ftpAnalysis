package com.longruan.ftpanalysis.mq.model.rydw;

import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.io.Serializable;
import java.util.Date;

@MsgName(job = "实时数据", filePath = "*_HJSS_*", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.NC_PERSON)

public class Person implements Serializable {
    /**
     * 数据时间
     */
    private java.lang.String dataTime;
    /**
     * 姓名
     */
    private java.lang.String personName;
    /**
     * 人员编号
     */
    private java.lang.String cardId;
    /**
     * 人员卡编码
     */
    private java.lang.String personId;
    /**
     * 工种
     */
    private java.lang.String duty;
    /**
     * 部门
     */
    private java.lang.String department;
    /**
     * 是否矿领导
     */
    private java.lang.Integer leader;
    /**
     * 删除标识
     */
    private java.lang.Integer deleteFlag;
    /**
     * 身份证
     */
    private java.lang.String idCard;
    /**
     * 主要工作地点
     */
    private java.lang.String workSpace;
    /**
     * 生日
     */
    private java.lang.String birthday;
    /**
     * 性别
     */
    private java.lang.Integer sex;
    /**
     * 血型
     */
    private java.lang.Integer bloodType;
    /**
     * 学历
     */
    private java.lang.Integer education;
    /**
     * 婚姻状况
     */
    private java.lang.Integer marryStatus;
    /**
     * 电话
     */
    private java.lang.String telephone;
    /**
     * 手机
     */
    private java.lang.String mobile;
    /**
     * 住址
     */
    private java.lang.String address;
    /**
     * 证件编号
     */
    private java.lang.String certificateNoName;
    /**
     * 证件有效期
     */
    private java.util.Date certificateValideDate;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getWorkSpace() {
        return workSpace;
    }

    public void setWorkSpace(String workSpace) {
        this.workSpace = workSpace;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getBloodType() {
        return bloodType;
    }

    public void setBloodType(Integer bloodType) {
        this.bloodType = bloodType;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getMarryStatus() {
        return marryStatus;
    }

    public void setMarryStatus(Integer marryStatus) {
        this.marryStatus = marryStatus;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCertificateNoName() {
        return certificateNoName;
    }

    public void setCertificateNoName(String certificateNoName) {
        this.certificateNoName = certificateNoName;
    }

    public Date getCertificateValideDate() {
        return certificateValideDate;
    }

    public void setCertificateValideDate(Date certificateValideDate) {
        this.certificateValideDate = certificateValideDate;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getLeader() {
        return leader;
    }

    public void setLeader(Integer leader) {
        this.leader = leader;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
