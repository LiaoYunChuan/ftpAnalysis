package com.longruan.ftpanalysis.mq.model.emp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.sql.Timestamp;

@MsgName(job = "特种人员预设路线数据", filePath = "*RYYS", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_SPECIAL_ROUTE)
public class SpecialRoute {

    @FieldOrder(order = 1)
    private String 	mine_id;//a）煤矿编码 1
    @FieldOrder(order = 2)
    private String  person_id;//b）人员卡编码 2
    @FieldOrder(order = 3)
    private String  person_name;//c）姓名 3
    @FieldOrder(order = 4)
    private String  person_duty;//d）工种或职务 4
    @FieldOrder(order = 5)
    private String  person_track;//分站时间集合

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

    public String getPerson_duty() {
        return person_duty;
    }

    public void setPerson_duty(String person_duty) {
        this.person_duty = person_duty;
    }

    public String getPerson_track() {
        return person_track;
    }

    public void setPerson_track(String person_track) {
        this.person_track = person_track;
    }
}
