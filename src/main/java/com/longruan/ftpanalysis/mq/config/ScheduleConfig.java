//package com.longruan.ftpanalysis.mq.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
///**
// * 定时任务配置信息
// */
//@Configuration(value = "scheduleConfig")
//@PropertySource("classpath:schedule.properties")
//public class ScheduleConfig {
//
//    //企业信息上传
//    @Value("${companyCron}")
//    private String companyCron;
//    @Value("${task.companyCron.switch}")
//    private Boolean companyCronSwith;
//
//    //传感器信息同步
//    @Value("${cgqsjCorn}")
//    private String cgqsjCorn;
//    @Value("${task.cgqsjCorn.switch}")
//    private Boolean cgqsjCornSwitch;
//
//    //传感器信息上传
//    @Value("${sensorCron}")
//    private String sensorCron;
//    @Value("${task.sensorCron.switch}")
//    private Boolean sensorCronSwith;
//
//    //安全监测实时数据同步
//    @Value("${realtimeDataformysql}")
//    private String realtimeDataformysql;
//    @Value("${task.realtimeDataformysql.switch}")
//    private Boolean realtimeDataformysqlSwitvh;
//
//    //安全监测实时数据上传
//    @Value("${realtimedataCron}")
//    private String realTimeDataCron;
//    @Value("${task.realtimedataCron.switch}")
//    private Boolean realTimeDataCronSwith;
//
//    /*异常数据上传*/
//    @Value("${warnDataCron}")
//    private String warnDataCron;
//    @Value("${task.warnDataCron.switch}")
//    private Boolean warnDataCronCornSwith;
//
//    //人员信息同步
//    @Value("${personSynCorn}")
//    private String personSynCorn;
//    @Value("${task.personSynCorn.switch}")
//    private Boolean personSynCornSwitch;
//
//    //人员信息上传
//    @Value("${personUpCorn}")
//    private String personUpCorn;
//    @Value("${task.personUpCorn.switch}")
//    private Boolean personUpCornSwitch;
//
//    //区域信息同步
//    @Value("${areaSynCorn}")
//    private String areaSynCorn;
//    @Value("${task.areaSynCorn.switch}")
//    private Boolean areaSynCornSwitch;
//
//    //区域信息上传
//    @Value("${areaUpCorn}")
//    private String areaUpCorn;
//    @Value("${task.areaUpCorn.switch}")
//    private Boolean areaUpCornSwitch;
//
//    //分站信息同步
//    @Value("${stationSynCorn}")
//    private String stationSynCorn;
//    @Value("${task.stationSynCorn.switch}")
//    private Boolean stationSynCornSwitch;
//
//    //分站信息上传
//    @Value("${stationUpCorn}")
//    private String stationUpCorn;
//    @Value("${task.stationUpCorn.switch}")
//    private Boolean stationUpCornSwitch;
//
//    //人员定位实时数据同步
//    @Value("${plRealDataSynCorn}")
//    private String plRealDataSynCorn;
//    @Value("${task.plRealDataSynCorn.switch}")
//    private Boolean plRealDataSynCornSwitch;
//
//    //人员定位实时数据上传
//    @Value("${plRealDataUpCorn}")
//    private String plRealDataUpCorn;
//    @Value("${task.plRealDataUpCorn.switch}")
//    private Boolean plRealDataUpCornSwitch;
//
//    //设备类型同步
//    @Value("${equTypeSynCorn}")
//    private String equTypeSynCorn;
//    @Value("${task.equTypeSynCorn.switch}")
//    private Boolean equTypeSynCornSwitch;
//
//    //设备类型上传
//    @Value("${equTypeUpCorn}")
//    private String equTypeUpCorn;
//    @Value("${task.equTypeUpCorn.switch}")
//    private Boolean equTypeUpCornSwitch;
//
//    // 设备信息同步
//    @Value("${equInfoSynCorn}")
//    private String equInfoSynCorn;
//    @Value("${task.equInfoSynCorn.switch}")
//    private Boolean equInfoSynCornSwitch;
//
//    // 设备信息上传
//    @Value("${equInfoUpCorn}")
//    private String equInfoUpCorn;
//    @Value("${task.equInfoUpCorn.switch}")
//    private Boolean equInfoUpCornSwitch;
//
//    // 设备实时数据同步
//    @Value("${equRTDataSynCorn}")
//    private String equRTDataSynCorn;
//    @Value("${task.equRTDataSynCorn.switch}")
//    private Boolean equRTDataSynCornSwitch;
//
//    // 设备实时数据上传
//    @Value("${equRTDataUpCorn}")
//    private String equRTDataUpCorn;
//    @Value("${task.equRTDataUpCorn.switch}")
//    private Boolean equRTDataUpCornSwitch;
//
//    @Value("${plOverTimeData}")
//    private String plOverTimeDataCorn;
//    @Value("${task.plOverTimeData.switch}")
//    private Boolean plOverTimeDataCornSwitch;
//
//    @Value("${overPersonUpCron}")
//    private String overPersonUpCron;
//    @Value("${task.overPersonUpCron.switch}")
//    private Boolean overPersonUpCronSwitch;
//
//    public String getOverPersonUpCron() {
//        return overPersonUpCron;
//    }
//
//    public void setOverPersonUpCron(String overPersonUpCron) {
//        this.overPersonUpCron = overPersonUpCron;
//    }
//
//    public Boolean getOverPersonUpCronSwitch() {
//        return overPersonUpCronSwitch;
//    }
//
//    public void setOverPersonUpCronSwitch(Boolean overPersonUpCronSwitch) {
//        this.overPersonUpCronSwitch = overPersonUpCronSwitch;
//    }
//
//    public String getPlOverTimeDataCorn() {
//        return plOverTimeDataCorn;
//    }
//
//    public void setPlOverTimeDataCorn(String plOverTimeDataCorn) {
//        this.plOverTimeDataCorn = plOverTimeDataCorn;
//    }
//
//    public Boolean getPlOverTimeDataCornSwitch() {
//        return plOverTimeDataCornSwitch;
//    }
//
//    public void setPlOverTimeDataCornSwitch(Boolean plOverTimeDataCornSwitch) {
//        this.plOverTimeDataCornSwitch = plOverTimeDataCornSwitch;
//    }
//
//    public String getEquTypeUpCorn() {
//        return equTypeUpCorn;
//    }
//
//    public String getEquRTDataSynCorn() {
//        return equRTDataSynCorn;
//    }
//
//    public void setEquRTDataSynCorn(String equRTDataSynCorn) {
//        this.equRTDataSynCorn = equRTDataSynCorn;
//    }
//
//    public Boolean getEquRTDataSynCornSwitch() {
//        return equRTDataSynCornSwitch;
//    }
//
//    public void setEquRTDataSynCornSwitch(Boolean equRTDataSynCornSwitch) {
//        this.equRTDataSynCornSwitch = equRTDataSynCornSwitch;
//    }
//
//    public String getEquRTDataUpCorn() {
//        return equRTDataUpCorn;
//    }
//
//    public void setEquRTDataUpCorn(String equRTDataUpCorn) {
//        this.equRTDataUpCorn = equRTDataUpCorn;
//    }
//
//    public Boolean getEquRTDataUpCornSwitch() {
//        return equRTDataUpCornSwitch;
//    }
//
//    public void setEquRTDataUpCornSwitch(Boolean equRTDataUpCornSwitch) {
//        this.equRTDataUpCornSwitch = equRTDataUpCornSwitch;
//    }
//
//    public void setEquTypeUpCorn(String equTypeUpCorn) {
//        this.equTypeUpCorn = equTypeUpCorn;
//    }
//
//    public Boolean getEquTypeUpCornSwitch() {
//        return equTypeUpCornSwitch;
//    }
//
//    public void setEquTypeUpCornSwitch(Boolean equTypeUpCornSwitch) {
//        this.equTypeUpCornSwitch = equTypeUpCornSwitch;
//    }
//
//    public String getEquTypeSynCorn() {
//        return equTypeSynCorn;
//    }
//
//    public void setEquTypeSynCorn(String equTypeSynCorn) {
//        this.equTypeSynCorn = equTypeSynCorn;
//    }
//
//    public Boolean getEquTypeSynCornSwitch() {
//        return equTypeSynCornSwitch;
//    }
//
//    public void setEquTypeSynCornSwitch(Boolean equTypeSynCornSwitch) {
//        this.equTypeSynCornSwitch = equTypeSynCornSwitch;
//    }
//
//    public String getPlRealDataSynCorn() {
//        return plRealDataSynCorn;
//    }
//
//    public void setPlRealDataSynCorn(String plRealDataSynCorn) {
//        this.plRealDataSynCorn = plRealDataSynCorn;
//    }
//
//    public Boolean getPlRealDataSynCornSwitch() {
//        return plRealDataSynCornSwitch;
//    }
//
//    public void setPlRealDataSynCornSwitch(Boolean plRealDataSynCornSwitch) {
//        this.plRealDataSynCornSwitch = plRealDataSynCornSwitch;
//    }
//
//    public String getPlRealDataUpCorn() {
//        return plRealDataUpCorn;
//    }
//
//    public void setPlRealDataUpCorn(String plRealDataUpCorn) {
//        this.plRealDataUpCorn = plRealDataUpCorn;
//    }
//
//    public Boolean getPlRealDataUpCornSwitch() {
//        return plRealDataUpCornSwitch;
//    }
//
//    public void setPlRealDataUpCornSwitch(Boolean plRealDataUpCornSwitch) {
//        this.plRealDataUpCornSwitch = plRealDataUpCornSwitch;
//    }
//
//    public String getRealtimeDataformysql() {
//        return realtimeDataformysql;
//    }
//
//    public void setRealtimeDataformysql(String realtimeDataformysql) {
//        this.realtimeDataformysql = realtimeDataformysql;
//    }
//
//    public Boolean getRealtimeDataformysqlSwitvh() {
//        return realtimeDataformysqlSwitvh;
//    }
//
//    public void setRealtimeDataformysqlSwitvh(Boolean realtimeDataformysqlSwitvh) {
//        this.realtimeDataformysqlSwitvh = realtimeDataformysqlSwitvh;
//    }
//
//    public String getAreaSynCorn() {
//        return areaSynCorn;
//    }
//
//    public void setAreaSynCorn(String areaSynCorn) {
//        this.areaSynCorn = areaSynCorn;
//    }
//
//    public Boolean getAreaSynCornSwitch() {
//        return areaSynCornSwitch;
//    }
//
//    public void setAreaSynCornSwitch(Boolean areaSynCornSwitch) {
//        this.areaSynCornSwitch = areaSynCornSwitch;
//    }
//
//    public String getAreaUpCorn() {
//        return areaUpCorn;
//    }
//
//    public void setAreaUpCorn(String areaUpCorn) {
//        this.areaUpCorn = areaUpCorn;
//    }
//
//    public Boolean getAreaUpCornSwitch() {
//        return areaUpCornSwitch;
//    }
//
//    public void setAreaUpCornSwitch(Boolean areaUpCornSwitch) {
//        this.areaUpCornSwitch = areaUpCornSwitch;
//    }
//
//    public String getStationSynCorn() {
//        return stationSynCorn;
//    }
//
//    public void setStationSynCorn(String stationSynCorn) {
//        this.stationSynCorn = stationSynCorn;
//    }
//
//    public Boolean getStationSynCornSwitch() {
//        return stationSynCornSwitch;
//    }
//
//    public void setStationSynCornSwitch(Boolean stationSynCornSwitch) {
//        this.stationSynCornSwitch = stationSynCornSwitch;
//    }
//
//    public String getStationUpCorn() {
//        return stationUpCorn;
//    }
//
//    public void setStationUpCorn(String stationUpCorn) {
//        this.stationUpCorn = stationUpCorn;
//    }
//
//    public Boolean getStationUpCornSwitch() {
//        return stationUpCornSwitch;
//    }
//
//    public void setStationUpCornSwitch(Boolean stationUpCornSwitch) {
//        this.stationUpCornSwitch = stationUpCornSwitch;
//    }
//
//    public String getPersonUpCorn() {
//        return personUpCorn;
//    }
//
//    public void setPersonUpCorn(String personUpCorn) {
//        this.personUpCorn = personUpCorn;
//    }
//
//    public Boolean getPersonUpCornSwitch() {
//        return personUpCornSwitch;
//    }
//
//    public void setPersonUpCornSwitch(Boolean personUpCornSwitch) {
//        this.personUpCornSwitch = personUpCornSwitch;
//    }
//
//    public String getPersonSynCorn() {
//        return personSynCorn;
//    }
//
//    public void setPersonSynCorn(String personSynCorn) {
//        this.personSynCorn = personSynCorn;
//    }
//
//    public Boolean getPersonSynCornSwitch() {
//        return personSynCornSwitch;
//    }
//
//    public void setPersonSynCornSwitch(Boolean personSynCornSwitch) {
//        this.personSynCornSwitch = personSynCornSwitch;
//    }
//
//    public String getCgqsjCorn() {
//        return cgqsjCorn;
//    }
//
//    public void setCgqsjCorn(String cgqsjCorn) {
//        this.cgqsjCorn = cgqsjCorn;
//    }
//
//    public Boolean getCgqsjCornSwitch() {
//        return cgqsjCornSwitch;
//    }
//
//    public void setCgqsjCornSwitch(Boolean cgqsjCornSwitch) {
//        this.cgqsjCornSwitch = cgqsjCornSwitch;
//    }
//
//    public String getEquInfoSynCorn() {
//        return equInfoSynCorn;
//    }
//
//    public void setEquInfoSynCorn(String equInfoSynCorn) {
//        this.equInfoSynCorn = equInfoSynCorn;
//    }
//
//    public Boolean getEquInfoSynCornSwitch() {
//        return equInfoSynCornSwitch;
//    }
//
//    public void setEquInfoSynCornSwitch(Boolean equInfoSynCornSwitch) {
//        this.equInfoSynCornSwitch = equInfoSynCornSwitch;
//    }
//
//    public String getEquInfoUpCorn() {
//        return equInfoUpCorn;
//    }
//
//    public void setEquInfoUpCorn(String equInfoUpCorn) {
//        this.equInfoUpCorn = equInfoUpCorn;
//    }
//
//    public Boolean getEquInfoUpCornSwitch() {
//        return equInfoUpCornSwitch;
//    }
//
//    public void setEquInfoUpCornSwitch(Boolean equInfoUpCornSwitch) {
//        this.equInfoUpCornSwitch = equInfoUpCornSwitch;
//    }
//
//    public String getRealTimeDataCron() {
//        return realTimeDataCron;
//    }
//
//    public void setRealTimeDataCron(String realTimeDataCron) {
//        this.realTimeDataCron = realTimeDataCron;
//    }
//
//    public Boolean getRealTimeDataCronSwith() {
//        return realTimeDataCronSwith;
//    }
//
//    public void setRealTimeDataCronSwith(Boolean realTimeDataCronSwith) {
//        this.realTimeDataCronSwith = realTimeDataCronSwith;
//    }
//
//    public String getSensorCron() {
//        return sensorCron;
//    }
//
//    public void setSensorCron(String sensorCron) {
//        this.sensorCron = sensorCron;
//    }
//
//    public Boolean getSensorCronSwith() {
//        return sensorCronSwith;
//    }
//
//    public void setSensorCronSwith(Boolean sensorCronSwith) {
//        this.sensorCronSwith = sensorCronSwith;
//    }
//
//    public String getCompanyCron() {
//        return companyCron;
//    }
//
//    public void setCompanyCron(String companyCron) {
//        this.companyCron = companyCron;
//    }
//
//    public Boolean getCompanyCronSwith() {
//        return companyCronSwith;
//    }
//
//    public void setCompanyCronSwith(Boolean companyCronSwith) {
//        this.companyCronSwith = companyCronSwith;
//    }
//
//    public String getWarnDataCron() {
//        return warnDataCron;
//    }
//
//    public void setWarnDataCron(String warnDataCron) {
//        this.warnDataCron = warnDataCron;
//    }
//
//    public Boolean getWarnDataCronCornSwith() {
//        return warnDataCronCornSwith;
//    }
//
//    public void setWarnDataCronCornSwith(Boolean warnDataCronCornSwith) {
//        this.warnDataCronCornSwith = warnDataCronCornSwith;
//    }
//}
