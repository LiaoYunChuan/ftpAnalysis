package com.longruan.ftpanalysis.mq.model.emp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.sql.Date;
import java.sql.Timestamp;

@MsgName(job = "人员基础数据", filePath = "*RYRY", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_PERSON)
public class Person {

    @FieldOrder(order = 1)
    private String mine_id;//a）煤矿编码 1
    @FieldOrder(order = 2)
    private String person_id;//人员卡编码2
    @FieldOrder(order = 3)
    private String person_name;//c）姓名3
    @FieldOrder(order = 4)
    private String id_card;//d）身份证号码4
    @FieldOrder(order = 5)
    private String duty;//e）工种或职务5
    @FieldOrder(order = 6)
    private String department;// f）所在区队班组/部门6
    @FieldOrder(order = 7)
    private String work_place;//g）主要工作地点7
    @FieldOrder(order = 8)
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date birthday;// h）出生年月8
    @FieldOrder(order = 9)
    private String sex;//i）性别9
    @FieldOrder(order = 10)
    private String blood_type;//j）血型10
    @FieldOrder(order = 11)
    private String education;//k）学历(11
    @FieldOrder(order = 12)
    private String marry_status;//l）婚姻状况12
    @FieldOrder(order = 13)
    private String telephone;//m）联系电话13
    @FieldOrder(order = 14)
    private String mobile;//n）手机号码14
    @FieldOrder(order = 15)
    private String address;//o）家庭地址15
    @FieldOrder(order = 16)
    private String certificate_no_name;//p）工种证件名称及编号16
    @FieldOrder(order = 17)
    private Date certificate_valid_date;//q）工种证件有效日期17
    private Boolean is_leader;//是否领导

    public String getMine_id() {
        return mine_id;
    }

    public void setMine_id(String mine_id) {
        this.mine_id = mine_id;
    }

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
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

    public String getWork_place() {
        return work_place;
    }

    public void setWork_place(String work_place) {
        this.work_place = work_place;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMarry_status() {
        return marry_status;
    }

    public void setMarry_status(String marry_status) {
        this.marry_status = marry_status;
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

    public String getCertificate_no_name() {
        return certificate_no_name;
    }

    public void setCertificate_no_name(String certificate_no_name) {
        this.certificate_no_name = certificate_no_name;
    }

    public Date getCertificate_valid_date() {
        return certificate_valid_date;
    }

    public void setCertificate_valid_date(Date certificate_valid_date) {
        this.certificate_valid_date = certificate_valid_date;
    }

    public Boolean getIs_leader() {
        return is_leader;
    }

    public void setIs_leader(Boolean is_leader) {
        this.is_leader = is_leader;
    }
}
