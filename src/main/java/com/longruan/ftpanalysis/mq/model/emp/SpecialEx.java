package com.longruan.ftpanalysis.mq.model.emp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.sql.Timestamp;

@MsgName(job = "特种人员作业异常数据", filePath = "*RYTZ", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_SPECIAL_EX)
public class SpecialEx {


    @FieldOrder(order = 1)
    private String mine_id; //煤矿编码（11位十进制数字）；
    @FieldOrder(order = 2)
    private String group_name;//集团名称（不超过5个汉字长度）；
    @FieldOrder(order = 3)
    private String company_name;//公司名称，不超过5个汉字长度，此处的公司是指集团公司下面的子公司，如果没有，则填写一个小写字母“x”）；
    @FieldOrder(order = 4)
    private String short_mine_name;//煤矿简称（不超过5个汉字长度）；
    @FieldOrder(order = 5)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp snap_time;//文件生成时刻
    @FieldOrder(order = 6)
    private String person_id;//人员卡编码
    @FieldOrder(order = 7)
    private String name;//人员姓名
    @FieldOrder(order = 8)
    private String idcard;//身份证号
    @FieldOrder(order = 9)
    private String duty;//工种或者职务
    @FieldOrder(order = 10)
    private String department;//部门
    @FieldOrder(order = 11)
    private String workplace;//主要工作地点
    @FieldOrder(order = 12)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp well_in;//入井时刻
    @FieldOrder(order = 13)
    private String area_id;//区域编码
    @FieldOrder(order = 14)
    private String area_name;//区域名称
    @FieldOrder(order = 15)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp area_in;//进入当前区域时刻
    @FieldOrder(order = 16)
    private String station_id;//分站编码
    @FieldOrder(order = 17)
    private String station_name;//分站编码
    @FieldOrder(order = 18)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp station_in;//进入当前所处分站时刻
    @FieldOrder(order = 19)
    private String should_at;// 应到地点
    @FieldOrder(order = 20)
    private Timestamp should_in;//应到时间
    @FieldOrder(order = 21)
    private String status;//状态
    @FieldOrder(order = 22)
    private Timestamp real_in;//实到时间

    public String getMine_id() {
        return mine_id;
    }

    public void setMine_id(String mine_id) {
        this.mine_id = mine_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getShort_mine_name() {
        return short_mine_name;
    }

    public void setShort_mine_name(String short_mine_name) {
        this.short_mine_name = short_mine_name;
    }

    public Timestamp getSnap_time() {
        return snap_time;
    }

    public void setSnap_time(Timestamp snap_time) {
        this.snap_time = snap_time;
    }

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
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

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public Timestamp getWell_in() {
        return well_in;
    }

    public void setWell_in(Timestamp well_in) {
        this.well_in = well_in;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public Timestamp getArea_in() {
        return area_in;
    }

    public void setArea_in(Timestamp area_in) {
        this.area_in = area_in;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public Timestamp getStation_in() {
        return station_in;
    }

    public void setStation_in(Timestamp station_in) {
        this.station_in = station_in;
    }

    public String getShould_at() {
        return should_at;
    }

    public void setShould_at(String should_at) {
        this.should_at = should_at;
    }

    public Timestamp getShould_in() {
        return should_in;
    }

    public void setShould_in(Timestamp should_in) {
        this.should_in = should_in;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getReal_in() {
        return real_in;
    }

    public void setReal_in(Timestamp real_in) {
        this.real_in = real_in;
    }
}
