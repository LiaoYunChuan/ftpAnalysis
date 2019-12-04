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
    }

    /***
     * 生产者bean名称
     *
     */
    public interface Producers {
        String PREFIX = "PRODUCER_";


    }
}
