package com.longruan.ftpanalysis.mq.config;

import com.longruan.ftpanalysis.mq.consts.MQConstants;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 初始化队列
 */
@Configuration
public class MQQueueConfig {

	/*企业数据*/
	@Bean(name= MQConstants.Queues.NC_COMPANY)
	public Queue companyInformationQueue() {
		return new Queue(MQConstants.Queues.NC_COMPANY);
	}


	/*传感器数据*/
	@Bean(name= MQConstants.Queues.NC_SM_SENSOR)
	public Queue sensorInformationQueue() {
		return new Queue(MQConstants.Queues.NC_SM_SENSOR);
	}


	/*传感器数据*/
	@Bean(name= MQConstants.Queues.NC_INPOTANT_CHANGE)
	public Queue importsensorInformationQueue() {
		return new Queue(MQConstants.Queues.NC_INPOTANT_CHANGE);
	}

	/*实时数据*/
	@Bean(name= MQConstants.Queues.NC_SM_REALTIME_DATA)
	public Queue realtimeDataInformationQueue() {
		return new Queue(MQConstants.Queues.NC_SM_REALTIME_DATA);
	}

	/**
	 * 人员定位-区域信息
	 * @return
	 */
	@Bean(name= MQConstants.Queues.NC_PL_AREA)
	public Queue areaQueue() {
		return new Queue(MQConstants.Queues.NC_PL_AREA);
	}

	/**
	 * 人员定位-人员信息
	 * @return
	 */
	@Bean(name= MQConstants.Queues.NC_PERSON)
	public Queue personQueue() {
		return new Queue(MQConstants.Queues.NC_PERSON);
	}

	/**
	 * 人员定位-分站信息
	 * @return
	 */
	@Bean(name= MQConstants.Queues.NC_PL_STATION)
	public Queue stationQueue() {
		return new Queue(MQConstants.Queues.NC_PL_STATION);
	}

	/**
	 * 人员定位-实时数据
	 * @return
	 */
	@Bean(name= MQConstants.Queues.NC_PL_RTDATA)
	public Queue PLRTDataQueue() {
		return new Queue(MQConstants.Queues.NC_PL_RTDATA);
	}


	/*人员定位-超时数据*/
	@Bean(name= MQConstants.Queues.NC_PL_OVERTIMEDATA)
	public Queue OverTimeDataQueue(){
		return new Queue(MQConstants.Queues.NC_PL_OVERTIMEDATA);
	}

	/**
	 * 人员定位-超员数据
	 * @return
	 */
	@Bean(name= MQConstants.Queues.NC_PL_OVERPERSONDATA)
	public Queue OverPersonQueue() {
		return new Queue(MQConstants.Queues.NC_PL_OVERPERSONDATA);
	}


	/*安监异常数据*/
	@Bean(name= MQConstants.Queues.NC_SM_ALARM)
	public Queue abnormaldataQueue() {
		return new Queue(MQConstants.Queues.NC_SM_ALARM);
	}

	/*安监异常反馈数据*/
	@Bean(name= MQConstants.Queues.NC_SM_ALARM_DEAL)
	public Queue abnormalfeedbackdataQueue() {
		return new Queue(MQConstants.Queues.NC_SM_ALARM_DEAL);
	}

	/*设备类型数据*/
	@Bean(name= MQConstants.Queues.NC_EQUIP_TYPE)
	public Queue equiptypedataQueue() {
		return new Queue(MQConstants.Queues.NC_EQUIP_TYPE);
	}

	/*设备信息数据*/
	@Bean(name= MQConstants.Queues.NC_EQUIPMENT)
	public Queue equiptinformationdataQueue() {
		return new Queue(MQConstants.Queues.NC_EQUIPMENT);
	}

	/*设备实时信息数据*/
	@Bean(name= MQConstants.Queues.NC_EQUIPMENT_DATA)
	public Queue equiptDatainformationdataQueue() {
		return new Queue(MQConstants.Queues.NC_EQUIPMENT_DATA);
	}



}
