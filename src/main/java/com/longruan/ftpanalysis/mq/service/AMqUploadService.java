package com.longruan.ftpanalysis.mq.service;

/**
 * 消息推送接口服务
 *
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.jeecg.dc.mq.service.IMqUploadService
 * @date 2019/5/17 11:06
 * @since 1.0.0
 **/

import com.longruan.ftpanalysis.mq.model.MQMsg;
import com.longruan.ftpanalysis.mq.model.SendMsgCache;
import com.longruan.ftpanalysis.mq.send.ISenderService;
import com.longruan.ftpanalysis.mq.service.impl.MsgRedisService;
import com.longruan.ftpanalysis.util.DateJsonValueProcessor;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.List;


public abstract class AMqUploadService  implements IMqUploadService {
    @Autowired
    private ISenderService senderService;
    @Autowired
    private MsgRedisService msgRedisService;

    /**
     * 推送消息
     * @param uploadBeanId 上传bean名称
     * @param exchange rabbitMQ交换名称
     * @param routingKey 路由key
     * @param msg 消息
     * @return
     */

    public String send(String uploadBeanId,String exchange, String routingKey, MQMsg msg) {
        List<String> idList=msg.getIdList();
        JsonConfig config = new JsonConfig();
        config.registerJsonValueProcessor(LocalDateTime.class,new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
        msg.setIdList(null);
        byte[] data = JSONObject.fromObject(msg,config).toString().getBytes(Charset.forName("UTF-8"));
        String messageId = senderService.send(exchange, routingKey, data);
        msgRedisService.addDataToCache(messageId, new SendMsgCache(uploadBeanId,idList));
        return messageId;
    }

    /**
     * 推送消息
     * @param uploadBeanId 上传bean名称
     * @param exchange rabbitMQ交换名称
     * @param msg 消息
     * @return
     */
    public String send(String uploadBeanId,String exchange, MQMsg msg) {
        return send(uploadBeanId,exchange, null, msg);
    }

    /**
     * 上传消息
     */
    public abstract void uploadData();
}
