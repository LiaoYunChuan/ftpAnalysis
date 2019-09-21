package com.longruan.ftpanalysis.mq.consts;


public final class MQConstants {

    /***
     * 队列名称
     *
     */
    public interface Queues {

        /*企业数据*/
        String NC_COMPANY="NC_COMPANY";

        /*传感器数据*/
        String NC_SM_SENSOR="NC_SM_SENSOR";

        /*重要测点数据*/
        String NC_INPOTANT_CHANGE="NC_INPOTANT_CHANGE";

        /*实时数据*/
        String NC_SM_REALTIME_DATA="NC_SM_REALTIME_DATA";

        /*异常数据*/
        String NC_SM_ALARM="NC_SM_ALARM";

        /*异常反馈数据*/
        String  NC_SM_ALARM_DEAL="NC_SM_ALARM_DEAL";

        /*设备类型数据*/
        String NC_EQUIP_TYPE="NC_EQUIP_TYPE";

        /*设备信息数据*/
        String NC_EQUIPMENT="NC_EQUIPMENT";

        String NC_EQUIPMENT_DATA="NC_EQUIPMENT_DATA";

        //人员定位-区域信息
        String NC_PL_AREA="NC_PL_AREA";

        //人员定位-人员信息
        String NC_PERSON="NC_PERSON";

        //人员定位-人员信息
        String NC_PL_STATION="NC_PL_STATION";

        //人员定位-实时数据
        String NC_PL_RTDATA="NC_PL_RTDATA";

        //人员定位-超时数据
        String NC_PL_OVERTIMEDATA="NC_OVERTIME_WARN";

        //人员定位-超员数据
        String NC_PL_OVERPERSONDATA="NC_OVERPERON_WARN";
    }

    /**
     * rabbitmq exchange
     */
    public interface ExChanges {
        String PREFIX = "EX_";

        static String getExChangesByQueueName(String queueName){
            return PREFIX+queueName;
        }

        /*企业数据*/
        String NC_COMPANY=PREFIX+ Queues.NC_COMPANY;

        /*传感器数据*/
        String NC_SM_SENSOR=PREFIX+ Queues.NC_SM_SENSOR;

        /*重要测点数据*/
        String NC_INPOTANT_CHANGE=PREFIX+ Queues.NC_INPOTANT_CHANGE;

        /*实时数据*/
        String NC_SM_REALTIME_DATA=PREFIX+ Queues.NC_SM_REALTIME_DATA;

        /*安全监测-异常数据*/
        String NC_SM_ALARM=PREFIX+ Queues.NC_SM_ALARM;

        /*异常反馈数据*/
        String NC_SM_ALARM_DEAL=PREFIX+ Queues.NC_SM_ALARM_DEAL;

        /*设备类型数据*/
        String NC_EQUIP_TYPE=PREFIX+ Queues.NC_EQUIP_TYPE;

        /*设备信息数据*/
        String NC_EQUIPMENT=PREFIX+ Queues.NC_EQUIPMENT;

        /*设备实时数据*/
        String NC_EQUIPMENT_DATA=PREFIX+ Queues.NC_EQUIPMENT_DATA;

        //人员定位-区域信息
        String NC_PL_AREA=PREFIX+ Queues.NC_PL_AREA;

        //人员定位-人员信息
        String NC_PERSON=PREFIX+ Queues.NC_PERSON;

        //人员定位-分站信息
        String NC_PL_STATION=PREFIX+ Queues.NC_PL_STATION;

        //人员定位-实时数据
        String NC_PL_RTDATA=PREFIX+ Queues.NC_PL_RTDATA;

        //人员定位-超时数据
        String NC_PL_OVERTIMEDATA=PREFIX+ Queues.NC_PL_OVERTIMEDATA;

        //人员定位-超员数据
        String NC_PL_OVERPERSONDATA=PREFIX+ Queues.NC_PL_OVERPERSONDATA;
    }

    /***
     * 生产者bean名称
     *
     */
    public interface Producers {
        String PREFIX = "PRODUCER_";
        static String getProducerByQueueName(String queueName){
            return PREFIX+queueName;
        }

        /*企业数据*/
        String NC_COMPANY=PREFIX+ Queues.NC_COMPANY;

        /*传感器数据*/
        String NC_SM_SENSOR=PREFIX+ Queues.NC_SM_SENSOR;

        /*重要测点数据*/
        String NC_INPOTANT_CHANGE=PREFIX+ Queues.NC_INPOTANT_CHANGE;

        /*实时数据*/
        String NC_SM_REALTIME_DATA=PREFIX+ Queues.NC_SM_REALTIME_DATA;

        /*安监-异常数据*/
        String NC_SM_ALARM=PREFIX+ Queues.NC_SM_ALARM;

        /*异常反馈数据*/
        String NC_SM_ALARM_DEAL=PREFIX+ Queues.NC_SM_ALARM_DEAL;

        /*设备类型数据*/
        String NC_EQUIP_TYPE=PREFIX+ Queues.NC_EQUIP_TYPE;

        /*设备信息*/
        String NC_EQUIPMENT=PREFIX+ Queues.NC_EQUIPMENT;

        /*设备实时数据*/
        String NC_EQUIPMENT_DATA=PREFIX+ Queues.NC_EQUIPMENT_DATA;

        //人员定位-区域信息
        String NC_PL_AREA=PREFIX+ Queues.NC_PL_AREA;

        //人员定位-人员信息
        String NC_PERSON=PREFIX+ Queues.NC_PERSON;

        //人员定位-分站信息
        String NC_PL_STATION=PREFIX+ Queues.NC_PL_STATION;

        //人员定位-实时数据
        String NC_PL_RTDATA=PREFIX+ Queues.NC_PL_RTDATA;


        //人员定位-超时数据
        String NC_PL_OVERTIMEDATA=PREFIX+ Queues.NC_PL_OVERTIMEDATA;

        //人员定位-超员数据
        String NC_PL_OVERPERSONDATA=PREFIX+ Queues.NC_PL_OVERPERSONDATA;

    }
}
