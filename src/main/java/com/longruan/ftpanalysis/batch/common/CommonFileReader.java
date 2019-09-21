package com.longruan.ftpanalysis.batch.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.FieldOrders;
import com.longruan.ftpanalysis.mq.model.hjjc.CompanyInfomation;
import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.mapping.PatternMatchingCompositeLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

public class CommonFileReader extends FlatFileItemReader {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public CommonFileReader(Class headClz, Class dataClz) {

        String[] headField = getFieldStr(headClz);
        List<String[]> dataFields = getFieldStrByGroup(dataClz);

        PatternMatchingCompositeLineMapper lineMapper = new PatternMatchingCompositeLineMapper<>();
        Map<String, LineTokenizer> lineTokenizers = new HashMap<>();
        Map<String, FieldSetMapper> fieldSetMappers = new HashMap<>();

        System.err.println("读取文件 ：  : ");
        System.err.println("           headClz : " + headClz);
        System.err.println("           dataClz : " + dataClz);

        {
            String headTokenizers = Arrays.stream(headField).map(e -> "*").collect(Collectors.joining(","));
            lineTokenizers.put(headTokenizers, new DelimitedLineTokenizer() {{
                setNames(headField);
            }});
            fieldSetMappers.put(headTokenizers, new BeanWrapperFieldSetMapper() {{
                setTargetType(headClz);
            }});
            System.err.println("           headTokenizers : " + headTokenizers);
            System.err.println("           headField : " + headField);
        }

        for (String[] dataField : dataFields) {
            String dataTokenizers = Arrays.stream(dataField).map(e -> "*").collect(Collectors.joining(","));
            lineTokenizers.put(dataTokenizers, new DelimitedLineTokenizer() {{
                setNames(dataField);
            }});
            fieldSetMappers.put(dataTokenizers, new BeanWrapperFieldSetMapper() {{
                setTargetType(dataClz);
            }});
            System.err.println("           dataTokenizers : " + dataTokenizers);
            System.err.println("           dataField : " + dataField);
        }
        lineMapper.setTokenizers(lineTokenizers);
        lineMapper.setFieldSetMappers(fieldSetMappers);
        // 如果包含header，需要忽略掉
//        reader.setLinesToSkip(1);
        setLineMapper(lineMapper);
    }


    public static List<String[]> getFieldStrByGroup(Class clz) {
        Field[] fields = clz.getDeclaredFields();
        Map<String, Map<String, Integer>> fieldGroups = new HashMap<>(0);
        Arrays.stream(fields)
                .filter(e -> e.getAnnotation(FieldOrders.class) != null)
                .forEach(e -> {
                    FieldOrders fieldOrders = e.getAnnotation(FieldOrders.class);
                    FieldOrder[] fos = e.getAnnotation(FieldOrders.class).value();
                    Arrays.stream(fos).forEach(order -> {
                        Map<String, Integer> fieldOrderMap = fieldGroups.get(order.group());
                        if (fieldOrderMap == null) fieldOrderMap = new LinkedHashMap<>();
                        JSONField jSONField = e.getAnnotation(JSONField.class);
                        fieldOrderMap.put(Strings.isNotBlank(jSONField.name()) ? jSONField.name() : e.getName(), order.order());
                        fieldGroups.put(order.group(), fieldOrderMap);
                    });
                });
        List<String[]> fieldStrByGroup = fieldGroups.values().stream()
                .map(e -> e.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                        .toArray(String[]::new))
                .collect(Collectors.toList());
        return fieldStrByGroup;
    }

    public static String[] getFieldStr(Class clz) {
        Field[] fields = clz.getDeclaredFields();
        return Arrays.stream(fields)
                .filter(e -> e.getAnnotation(FieldOrder.class) != null)
                .sorted(Comparator.comparingInt(e -> e.getAnnotation(FieldOrder.class).order()))
                .map(Field::getName).toArray(String[]::new);
    }


    public static void main(String[] args) {
//        System.err.println(JSON.toJSONString(getFieldStr(FileHead.class)));

        System.err.println(JSON.toJSONString(getFieldStrByGroup(CompanyInfomation.class)));
    }
}
