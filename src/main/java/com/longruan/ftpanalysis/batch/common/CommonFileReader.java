package com.longruan.ftpanalysis.batch.common;

import com.longruan.ftpanalysis.batch.config.BatchConfig;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.mq.model.MQMsg;
import com.longruan.ftpanalysis.mq.model.MsgHead;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.mapping.PatternMatchingCompositeLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class CommonFileReader {

    public static MQMsg read(String result, Class dataClz, BatchConfig batchConfig) throws Exception {
        if (StringUtils.isEmpty(result)) return null;
        String[] lines = result.split("(\\r\\n|\\n|\\n\\r)");
        PatternMatchingCompositeLineMapper dataMapper = new PatternMatchingCompositeLineMapper<>();
        Map<String, LineTokenizer> lineTokenizers = new HashMap<>();
        Map<String, FieldSetMapper> fieldSetMappers = new HashMap<>();
        {
            String[] dataField = getFieldStr(dataClz);
            String dataTokenizers = Arrays.stream(dataField).map(e -> "*").collect(Collectors.joining(";"));
            lineTokenizers.put(dataTokenizers, new DelimitedLineTokenizer(";") {{
                setNames(dataField);
            }});
            fieldSetMappers.put(dataTokenizers, new BeanWrapperFieldSetMapper() {{
                setTargetType(dataClz);
            }});
        }
        dataMapper.setTokenizers(lineTokenizers);
        dataMapper.setFieldSetMappers(fieldSetMappers);
        List items = new ArrayList<>();
        MQMsg mQMsg = new MQMsg();
        MsgHead msgHead = new MsgHead();
        if (lines.length > 0) {
            int i = 0;
            for (String line : lines) {
                try {
                    Object data = dataMapper.mapLine(line, 0);
                    if(i==0)BeanUtils.copyProperties(data, msgHead);

                    String mineidMapped = batchConfig.mineidMapped(msgHead.getMine_id());
                    if (mineidMapped != null) {
                        Method m = BeanUtils.findMethod(MsgHead.class, "setMine_id", String.class);
                        if (m != null) m.invoke(data, mineidMapped);
                    }
                    Method setSensorId = BeanUtils.findMethod(data.getClass(), "setSensor_id", String.class);
                    Method getSensorId = BeanUtils.findMethod(data.getClass(), "getSensor_id");
                    if (setSensorId != null) setSensorId.invoke(data, msgHead.getMine_id() + getSensorId.invoke(data));
                    items.add(data);
                } catch (Exception e) {
                }
                i++;
            }
            mQMsg.setData(items);
        }
        return mQMsg;
    }

    public static String[] getFieldStr(Class clz) {
        return Arrays.stream(FieldUtils.getAllFields(clz)).filter(e -> e.getAnnotation(FieldOrder.class) != null)
                .sorted(Comparator.comparingInt(e -> e.getAnnotation(FieldOrder.class).order()))
                .map(Field::getName).toArray(String[]::new);
    }
}
