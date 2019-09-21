package com.longruan.ftpanalysis.mq.config;

import com.longruan.ftpanalysis.mq.consts.MQConstants;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 队列和exchange绑定
 */
@Configuration
public class MQBindingConfig {
    /*企业数据*/
    @Bean
    public Binding bindingCompanyInformation(@Qualifier(MQConstants.Queues.NC_COMPANY) Queue q, @Qualifier(MQConstants.ExChanges.NC_COMPANY) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    /*传感数据*/
    @Bean
    public Binding bindingSensorInformation(@Qualifier(MQConstants.Queues.NC_SM_SENSOR) Queue q, @Qualifier(MQConstants.ExChanges.NC_SM_SENSOR) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    /*重要测点数据*/
    @Bean
    public Binding bindingInportantSensorInformation(@Qualifier(MQConstants.Queues.NC_INPOTANT_CHANGE) Queue q, @Qualifier(MQConstants.ExChanges.NC_INPOTANT_CHANGE) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    /*实时数据*/
    @Bean
    public Binding bindingrealtimeDataInformation(@Qualifier(MQConstants.Queues.NC_SM_REALTIME_DATA) Queue q, @Qualifier(MQConstants.ExChanges.NC_SM_REALTIME_DATA) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    //人员定位-区域信息
    @Bean
    public Binding bindingArea(@Qualifier(MQConstants.Queues.NC_PL_AREA) Queue q, @Qualifier(MQConstants.ExChanges.NC_PL_AREA) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    //人员定位-实时数据
    @Bean
    public Binding bindingPlRTData(@Qualifier(MQConstants.Queues.NC_PL_RTDATA) Queue q, @Qualifier(MQConstants.ExChanges.NC_PL_RTDATA) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    //人员定位-分站信息
    @Bean
    public Binding bindingStation(@Qualifier(MQConstants.Queues.NC_PL_STATION) Queue q, @Qualifier(MQConstants.ExChanges.NC_PL_STATION) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    //人员定位-人员信息
    @Bean
    public Binding bindingPerson(@Qualifier(MQConstants.Queues.NC_PERSON) Queue q, @Qualifier(MQConstants.ExChanges.NC_PERSON) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }


    //人员定位-超时信息
    @Bean
    public Binding bindingOverTimePerson(@Qualifier(MQConstants.Queues.NC_PL_OVERTIMEDATA) Queue q, @Qualifier(MQConstants.ExChanges.NC_PL_OVERTIMEDATA) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    //人员定位-超员数据
    @Bean
    public Binding bindingOverPerson(@Qualifier(MQConstants.Queues.NC_PL_OVERPERSONDATA) Queue q, @Qualifier(MQConstants.ExChanges.NC_PL_OVERPERSONDATA) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    /*安监异常数据*/
    @Bean
    public Binding bindingabnormaldata(@Qualifier(MQConstants.Queues.NC_SM_ALARM) Queue q, @Qualifier(MQConstants.ExChanges.NC_SM_ALARM) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    /*安监异常反馈数据*/
    @Bean
    public Binding bindingabnormalfeedbackdata(@Qualifier(MQConstants.Queues.NC_SM_ALARM_DEAL) Queue q, @Qualifier(MQConstants.ExChanges.NC_SM_ALARM_DEAL) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    /*设备类型数据*/
    @Bean
    public Binding bindingequittype(@Qualifier(MQConstants.Queues.NC_EQUIP_TYPE) Queue q, @Qualifier(MQConstants.ExChanges.NC_EQUIP_TYPE) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    /*设备信息数据*/
    @Bean
    public Binding bindingequitinformation(@Qualifier(MQConstants.Queues.NC_EQUIPMENT) Queue q, @Qualifier(MQConstants.ExChanges.NC_EQUIPMENT) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }

    /*设备实时信息数据*/
    @Bean
    public Binding bindingequitDatainformation(@Qualifier(MQConstants.Queues.NC_EQUIPMENT_DATA) Queue q, @Qualifier(MQConstants.ExChanges.NC_EQUIPMENT_DATA) FanoutExchange ex) {
        return BindingBuilder.bind(q).to(ex);
    }
}
