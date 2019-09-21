package com.longruan.ftpanalysis.mq.service.impl;

import com.longruan.ftpanalysis.mq.model.SendMsgCache;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * rabbitMQ推送消息缓存
 *
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.jeecg.dc.mq.service.impl.MsgRedisService
 * @date 2019/5/20 21:22
 * @since 1.0.0
 **/
@Service
public class MsgRedisService {
    @Resource
    private RedisTemplate redisTemplate;

//    private static Map<String,SendMsgCache> cacheMap = new ConcurrentHashMap<>();

    /**
     * 添加推送消息到缓存
     *
     * @param messageId    消息id
     * @param sendMsgCache 消息内容
     */
    public void addDataToCache(String messageId, SendMsgCache sendMsgCache) {
        redisTemplate.opsForValue().set(messageId, sendMsgCache);
        redisTemplate.expire(messageId,1, TimeUnit.DAYS);
    }

    /**
     * 获取推送消息到缓存
     *
     * @param messageId 消息id
     */
    public SendMsgCache getCacheData(String messageId) {
        if(redisTemplate.hasKey(messageId)){
            SendMsgCache msg = (SendMsgCache)redisTemplate.opsForValue().get(messageId);
            return msg;
        }
        return null;
    }

    /**
     * 删除消息
     * @param messageId 消息id
     */
    public void removeByKey(String messageId) {
        redisTemplate.delete(messageId);
    }

    public void pushList(String key,List list){
        redisTemplate.opsForList().leftPushAll(key,list);
    }

    public List rangeList(String key){
        return (List) redisTemplate.opsForList().range(key,0,-1);
    }

    public void setString(String key,String str){
        redisTemplate.opsForValue().set(key, str);
    }

    public String getString(String key){
        return (String) redisTemplate.opsForValue().get(key);
    }

    /**
     * 更新缓存
     * redis中存的对象集合，通过id匹配，更新集合中的某一个元素
     * @param key   redis key
     * @param entity
     */
    public void synCache(String key,Object entity){
        List<Object> localList=rangeList(key);
        if (!CollectionUtils.isEmpty(localList)){
            Method method= null;
            try {
                method = entity.getClass().getMethod("getId");
                for (Object data : localList) {
                    Object redisId= (Object) method.invoke(data);
                    Object dbId= (Object) method.invoke(entity);
                    if (redisId.equals(dbId)){
                        localList.remove(data);
                        localList.add(entity);
                        break;
                    }
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            removeByKey(key);
            pushList(key,localList);
        }
    }
}
