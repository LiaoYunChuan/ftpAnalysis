package com.longruan.ftpanalysis.mq.consts;


public final class MQConstants {

    final static String Q_PREFIX = "AQ_";
    final static String EX_PREFIX = "EX_";

    private interface QueueName {

//        String REALTIME_DATA = "SENSOR_RTDATA";
        String REALTIME_DATA = "SENSOR_RTDATA";
        String STATION = "SENSOR_STATION";
        String SENSORREF = "SENSOR_REF";
        String SENSORMC = "SENSOR_MC";
        String SENSORSWITCH = "SENSOR_KC";
        String SENSOR_RTDATA_HIS = "SENSOR_RTDATA_HIS";
        String SENSOR_WARNDATA = "SENSOR_WARN";
        String SENSOR_WARNDATA_HIS = "SENSOR_WARNDATA_HIS";
        String SENSOR_LJDATA = "SENSOR_ACUM";
        String SENSOR_TJ5DATA = "SENSOR_ANALOG";

        String EMP_MINE="EMP_MINE";//煤矿
        String EMP_AREA="EMP_AREA";//区域
        String EMP_PSTATION="EMP_PSTATION";//分站或者轨迹点参数
        String EMP_PSTATION_LINE="EMP_PSTATION_LINE";//轨迹线
        String EMP_PERSON="EMP_PERSON";//人员参数
        String EMP_SPECIAL_ROUTE="EMP_SPECIAL_ROUTE";//特种人员路线
        String EMP_RYSS="EMP_RYSS";//人员实时
        String EMP_OVER_TIME="EMP_OVER_TIME";//人员超时
        String EMP_OVER_PERSON="EMP_OVER_PERSON";//人员超员
        String EMP_SPECIAL_EX="EMP_SPECIAL_EX";//特种人员作业异常
        String EMP_SYS_EX="EMP_SYS_EX";//系统异常

        String AUTO_RTDATA="AUTO_RTDATA";//自动化实时数据
        String AUTO_DEV="AUTO_DEV";//自动化传感器

    }

    /***
     * 队列名称
     *
     */
    public interface Queues {

        String REALTIME_DATA = Q_PREFIX + QueueName.REALTIME_DATA;
        String STATION = Q_PREFIX + QueueName.STATION;
        String SENSORREF = Q_PREFIX + QueueName.SENSORREF;
        String SENSORMC = Q_PREFIX + QueueName.SENSORMC;
        String SENSOR_RTDATA_HIS = Q_PREFIX + QueueName.SENSOR_RTDATA_HIS;
        String SENSOR_WARNDATA = Q_PREFIX + QueueName.SENSOR_WARNDATA;
        String SENSOR_WARNDATA_HIS = Q_PREFIX + QueueName.SENSOR_WARNDATA_HIS;
        String SENSOR_LJDATA = Q_PREFIX + QueueName.SENSOR_LJDATA;
        String SENSOR_TJ5DATA = Q_PREFIX + QueueName.SENSOR_TJ5DATA;
        String SENSORSWITCH = Q_PREFIX + QueueName.SENSORSWITCH;


    }

    /**
     * rabbitmq exchange
     */
    public interface ExChanges {

        String REALTIME_DATA = EX_PREFIX + QueueName.REALTIME_DATA;
        String STATION = EX_PREFIX + QueueName.STATION;
        String SENSORREF = EX_PREFIX + QueueName.SENSORREF;
        String SENSORMC = EX_PREFIX + QueueName.SENSORMC;
        String SENSOR_RTDATA_HIS = EX_PREFIX + QueueName.SENSOR_RTDATA_HIS;
        String SENSOR_WARNDATA = EX_PREFIX + QueueName.SENSOR_WARNDATA;
        String SENSOR_WARNDATA_HIS = EX_PREFIX + QueueName.SENSOR_WARNDATA_HIS;
        String SENSOR_LJDATA = EX_PREFIX + QueueName.SENSOR_LJDATA;
        String SENSOR_TJ5DATA = EX_PREFIX + QueueName.SENSOR_TJ5DATA;
        String SENSORSWITCH = EX_PREFIX + QueueName.SENSORSWITCH;

        String EMP_MINE = EX_PREFIX+QueueName.EMP_MINE;//煤矿
        String EMP_AREA=EX_PREFIX+QueueName.EMP_AREA;//区域
        String EMP_PSTATION=EX_PREFIX+QueueName.EMP_PSTATION;//分站或者轨迹点参数
        String EMP_PSTATION_LINE=EX_PREFIX+QueueName.EMP_PSTATION_LINE;//轨迹线
        String EMP_PERSON=EX_PREFIX+QueueName.EMP_PERSON;//人员参数
        String EMP_SPECIAL_ROUTE=EX_PREFIX+QueueName.EMP_SPECIAL_ROUTE;//特种人员路线
        String EMP_RYSS=EX_PREFIX+QueueName.EMP_RYSS;//人员实时
        String EMP_OVER_TIME=EX_PREFIX+QueueName.EMP_OVER_TIME;//人员超时
        String EMP_OVER_PERSON=EX_PREFIX+QueueName.EMP_OVER_PERSON;//人员超员
        String EMP_SPECIAL_EX=EX_PREFIX+QueueName.EMP_SPECIAL_EX;//特种人员作业异常
        String EMP_SYS_EX=EX_PREFIX+QueueName.EMP_SYS_EX;//系统异常

        String AUTO_RTDATA=EX_PREFIX+QueueName.AUTO_RTDATA;//自动化实时数据
        String AUTO_DEV=EX_PREFIX+QueueName.AUTO_DEV;//自动化传感器
    }

    /***
     * 生产者bean名称
     *
     */
    public interface Producers {
        String PREFIX = "PRODUCER_";


    }
}
