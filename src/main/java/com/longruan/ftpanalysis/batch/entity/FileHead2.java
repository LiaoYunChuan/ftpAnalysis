package com.longruan.ftpanalysis.batch.entity;


public class FileHead2 {

    //生产经营单位编码 监测监控系统编码 数据标记 数据生成时间 数据记录条数
    @FieldOrder(order = 1)
    private String companyId;    //生产经营单位编码;
    @FieldOrder(order = 2)
    private String systype;    //监测监控系统编码;
    @FieldOrder(order = 3)
    private String upTime;    //上传时间;
    @FieldOrder(order = 4)
    private String dataTime;    //数据生成时间;
    @FieldOrder(order = 5)
    private String mnlNum;    //模拟量数据条数;
    @FieldOrder(order = 6)
    private String kglNum;    //开关量数据条数;
    @FieldOrder(order = 7)
    private String dtlNum;    //多态量数据条数;
    @FieldOrder(order = 8)
    private String BhlNum;    //保护量数据条数;
    @FieldOrder(order = 9)
    private String kzlNum;    //控制量数据条数;
    @FieldOrder(order = 10)
    private String ljlNum;    //累计量数据条数;
    @FieldOrder(order = 11)
    private String tjlNum;    //调节量数据条数;

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

    public String getUpTime() {
        return upTime;
    }

    public void setUpTime(String upTime) {
        this.upTime = upTime;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getMnlNum() {
        return mnlNum;
    }

    public void setMnlNum(String mnlNum) {
        this.mnlNum = mnlNum;
    }

    public String getKglNum() {
        return kglNum;
    }

    public void setKglNum(String kglNum) {
        this.kglNum = kglNum;
    }

    public String getDtlNum() {
        return dtlNum;
    }

    public void setDtlNum(String dtlNum) {
        this.dtlNum = dtlNum;
    }

    public String getBhlNum() {
        return BhlNum;
    }

    public void setBhlNum(String bhlNum) {
        BhlNum = bhlNum;
    }

    public String getKzlNum() {
        return kzlNum;
    }

    public void setKzlNum(String kzlNum) {
        this.kzlNum = kzlNum;
    }

    public String getLjlNum() {
        return ljlNum;
    }

    public void setLjlNum(String ljlNum) {
        this.ljlNum = ljlNum;
    }

    public String getTjlNum() {
        return tjlNum;
    }

    public void setTjlNum(String tjlNum) {
        this.tjlNum = tjlNum;
    }
}
