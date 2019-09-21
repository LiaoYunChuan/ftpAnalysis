package com.longruan.ftpanalysis.batch.entity;


public class FileHead {

    //生产经营单位编码 监测监控系统编码 数据标记 数据生成时间 数据记录条数

    @FieldOrder(order = 1)
    private String companyId;
    @FieldOrder(order = 2)
    private String systype;
    @FieldOrder(order = 3)
    private String mark;
    @FieldOrder(order = 4)
    private String dataTime;
    @FieldOrder(order = 5)
    private Integer num;

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getSystype() {
        return systype;
    }

    public void setSystype(String systype) {
        this.systype = systype;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
