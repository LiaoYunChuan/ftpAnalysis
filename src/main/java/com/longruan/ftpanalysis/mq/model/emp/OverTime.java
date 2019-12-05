package com.longruan.ftpanalysis.mq.model.emp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.sql.Timestamp;

@MsgName(job = "人员超时数据", filePath = "*RYSC", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_OVER_TIME)
public class OverTime {

    @FieldOrder(order = 1)
    private String id; //a--煤矿编码（11位十进制数字）；
    @FieldOrder(order = 2)
    private String group_name;//b--集团名称（不超过5个汉字长度）；
    @FieldOrder(order = 3)
    private String company_name;//c--公司名称，不超过5个汉字长度，此处的公司是指集团公司下面的子公司，如果没有，则填写一个小写字母“x”）；
    @FieldOrder(order = 4)
    private String short_mine_name;//d--煤矿简称（不超过5个汉字长度）；
    @FieldOrder(order = 5)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp snap_time;//e--文件生成时刻
    @FieldOrder(order = 6)
    private String person_id;//f--人员卡编码
    @FieldOrder(order = 7)
    private String name;//g--人员姓名
    @FieldOrder(order = 8)
    private String idcard;//h--身份证号
    @FieldOrder(order = 9)
    private String duty;//i--工种或者职务
    @FieldOrder(order = 10)
    private String department;//j--部门
    @FieldOrder(order = 11)
    private String workplace;//k--主要工作地点
    @FieldOrder(order = 12)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp well_in;//l--入井时刻
    @FieldOrder(order = 13)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp alarm_start;//m--报警开始时间
    @FieldOrder(order = 14)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp alarm_end;//n--报警结束时间
    @FieldOrder(order = 15)
    private String area_id;//o--区域编码
    @FieldOrder(order = 16)
    private String area_name;//p--区域名称
    @FieldOrder(order = 17)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp area_in;//q--进入当前区域时刻
    @FieldOrder(order = 18)
    private String station_id;//r--分站编码
    @FieldOrder(order = 19)
    private String station_name;//s--分站编码
    @FieldOrder(order = 20)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    Timestamp station_in;//t--进入当前所处分站时刻

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Timestamp getAlarm_start() {
        return alarm_start;
    }

    public void setAlarm_start(Timestamp alarm_start) {
        this.alarm_start = alarm_start;
    }

    public Timestamp getAlarm_end() {
        return alarm_end;
    }

    public void setAlarm_end(Timestamp alarm_end) {
        this.alarm_end = alarm_end;
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
}
