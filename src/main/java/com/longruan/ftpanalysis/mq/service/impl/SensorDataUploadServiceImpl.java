//package com.longruan.ftpanalysis.mq.service.impl;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.longruan.ftpanalysis.monitor.entity.Sensordata;
//import com.longruan.ftpanalysis.monitor.service.ISensordataService;
//import com.longruan.ftpanalysis.mq.consts.MQConstants;
//import com.longruan.ftpanalysis.mq.enums.EUploadFlag;
//import com.longruan.ftpanalysis.mq.model.MQMsg;
//import com.longruan.ftpanalysis.mq.model.SendMsgCache;
//import com.longruan.ftpanalysis.mq.service.AMqUploadService;
//import org.apache.commons.collections.CollectionUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
///*企业数据上传*/
//@Service(MQConstants.Producers.NC_SM_SENSOR)
//public class SensorDataUploadServiceImpl extends AMqUploadService {
//
//    @Autowired
//    private  MsgRedisService msgRedisService;
//    @Autowired
//    private ISensordataService sensordataService;
//    @Override
//    public void uploadData() {
//        QueryWrapper<Sensordata> wrapper=new QueryWrapper<>();
//        wrapper.in("upload_flag",EUploadFlag.未上传.getValue(),EUploadFlag.上传失败.getValue());
//        List<Sensordata> list = sensordataService.list(wrapper);
//        if(!CollectionUtils.isEmpty(list)){
//            MQMsg msg = createNewMqMsg();
//            List<String> idList=list.stream().map(r->r.getId().toString()).collect(Collectors.toList());
//            msg.setIdList(idList);
//            msg.setData(list);
//            send(MQConstants.Producers.NC_SM_SENSOR, MQConstants.ExChanges.NC_SM_SENSOR, msg);
//        }
//    }
//
//    @Override
//    public void batchUpdateCallBack(SendMsgCache sendMsgCache) {
//        List<String> ids=sendMsgCache.getIdList();
//        List<Sensordata> list=new ArrayList<>();
//        for (String id: ids) {
//            Sensordata sensordata = new Sensordata();
//            sensordata.setId(id);
//            sensordata.setUploadFlag(sendMsgCache.getUploadFlag().getValue());
//            sensordata.setUploadRemark(sendMsgCache.getUploadRemark());
//            sensordata.setUploadTime(LocalDateTime.now());
//            list.add(sensordata);
//        }
//        sensordataService.updateBatchById(list);
//        msgRedisService.removeByKey(sendMsgCache.getMessageId());
//    }
//}
