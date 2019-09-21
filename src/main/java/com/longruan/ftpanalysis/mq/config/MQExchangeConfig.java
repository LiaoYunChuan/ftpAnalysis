package com.longruan.ftpanalysis.mq.config;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 初始化exchange
 */
@Configuration
public class MQExchangeConfig {

    /*企业数据*/
    @Bean(name= MQConstants.ExChanges.NC_COMPANY)
    public FanoutExchange companyInformationExchange() {
        return new FanoutExchange(MQConstants.ExChanges.NC_COMPANY);
    }

    /*传感器数据*/
    @Bean(name= MQConstants.ExChanges.NC_SM_SENSOR)
    public FanoutExchange sensorInformationExchange(){
        return new FanoutExchange(MQConstants.ExChanges.NC_SM_SENSOR);
    }

    /*传感器数据*/
    @Bean(name= MQConstants.ExChanges.NC_INPOTANT_CHANGE)
    public FanoutExchange importsensorInformationExchange(){
        return new FanoutExchange(MQConstants.ExChanges.NC_INPOTANT_CHANGE);
    }

    /*实时数据*/
    @Bean(name= MQConstants.ExChanges.NC_SM_REALTIME_DATA)
    public FanoutExchange realtimeDataInformationExchange(){
        return new FanoutExchange(MQConstants.ExChanges.NC_SM_REALTIME_DATA);
    }
    /**
     * 人员定位-区域信息
     * @return
     */
    @Bean(name= MQConstants.ExChanges.NC_PL_AREA)
    public FanoutExchange areaExchange() {
        return new FanoutExchange(MQConstants.ExChanges.NC_PL_AREA);
    }

    /**
     * 人员定位-分站信息
     * @return
     */
    @Bean(name= MQConstants.ExChanges.NC_PL_STATION)
    public FanoutExchange stationExchange() {
        return new FanoutExchange(MQConstants.ExChanges.NC_PL_STATION);
    }

    /**
     * 人员定位-实时数据
     * @return
     */
    @Bean(name= MQConstants.ExChanges.NC_PL_RTDATA)
    public FanoutExchange plRtdataExchange() {
        return new FanoutExchange(MQConstants.ExChanges.NC_PL_RTDATA);
    }

    /**
     * 人员定位-人员信息
     * @return
     */
    @Bean(name= MQConstants.ExChanges.NC_PERSON)
    public FanoutExchange personExchange() {
        return new FanoutExchange(MQConstants.ExChanges.NC_PERSON);
    }
    /**
     * 人员定位-超时数据
     * @return
     */

    @Bean(name=MQConstants.ExChanges.NC_PL_OVERTIMEDATA)
    public FanoutExchange overTimeDataExcange(){
        return new FanoutExchange(MQConstants.ExChanges.NC_PL_OVERTIMEDATA);
    }
    /**
     * 人员定位-超员数据
     * @return
     */
    @Bean(name= MQConstants.ExChanges.NC_PL_OVERPERSONDATA)
    public FanoutExchange overPersonExchange() {
        return new FanoutExchange(MQConstants.ExChanges.NC_PL_OVERPERSONDATA);
    }

    /*安监异常数据*/
    @Bean(name= MQConstants.ExChanges.NC_SM_ALARM)
    public FanoutExchange abnormaldataExchange() {
        return new FanoutExchange(MQConstants.ExChanges.NC_SM_ALARM);
    }

    /*安监异常反馈数据*/
    @Bean(name= MQConstants.ExChanges.NC_SM_ALARM_DEAL)
    public FanoutExchange abnormalfeedbackdataExchange() {
        return new FanoutExchange(MQConstants.ExChanges.NC_SM_ALARM_DEAL);
    }

    /*设备类型数据*/
    @Bean(name= MQConstants.ExChanges.NC_EQUIP_TYPE)
    public FanoutExchange equiptypeExchange() {
        return new FanoutExchange(MQConstants.ExChanges.NC_EQUIP_TYPE);
    }

    /*设备信息数据*/
    @Bean(name= MQConstants.ExChanges.NC_EQUIPMENT)
    public FanoutExchange equiptinformationExchange() {
        return new FanoutExchange(MQConstants.ExChanges.NC_EQUIPMENT);
    }

    /*设备实时信息数据*/
    @Bean(name= MQConstants.ExChanges.NC_EQUIPMENT_DATA)
    public FanoutExchange equiptDatainformationExchange() {
        return new FanoutExchange(MQConstants.ExChanges.NC_EQUIPMENT_DATA);
    }
}
