//package com.longruan.ftpanalysis.batch.common;
//
//import com.alibaba.fastjson.JSON;
//import com.longruan.ftpanalysis.batch.entity.FieldOrder;
//import com.longruan.ftpanalysis.batch.entity.OtherBody;
//import org.apache.commons.lang3.reflect.FieldUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.batch.item.file.FlatFileItemReader;
//import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
//import org.springframework.batch.item.file.mapping.FieldSetMapper;
//import org.springframework.batch.item.file.mapping.PatternMatchingCompositeLineMapper;
//import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
//import org.springframework.batch.item.file.transform.LineTokenizer;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Field;
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class CommonFileReader extends FlatFileItemReader {
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    public CommonFileReader(Class dataClz) {
//
//        PatternMatchingCompositeLineMapper lineMapper = new PatternMatchingCompositeLineMapper<>();
//        Map<String, LineTokenizer> lineTokenizers = new HashMap<>();
//        Map<String, FieldSetMapper> fieldSetMappers = new HashMap<>();
//
//        System.err.println("读取方式  : ");
//        System.err.println("           dataClz : " + dataClz);
//
//        {
//            List<Class> dataClasses = new ArrayList<>(0);
//            dataClasses.add(dataClz);
//            Annotation anotation = dataClz.getDeclaredAnnotation(OtherBody.class);
//            OtherBody otherBody;
//            if (anotation != null) {
//                otherBody = (OtherBody) anotation;
//                dataClasses.addAll(Arrays.asList(otherBody.value()));
//            }
//
//            for (Class dataClass : dataClasses) {
//                String[] dataField = getFieldStr(dataClass);
//                if (dataField.length == 0) continue;
//                String dataTokenizers = Arrays.stream(dataField).map(e -> "*").collect(Collectors.joining(";"));
//                lineTokenizers.put(dataTokenizers, new DelimitedLineTokenizer(";") {{
//                    setNames(dataField);
//                }});
//                fieldSetMappers.put(dataTokenizers, new BeanWrapperFieldSetMapper() {{
//                    setTargetType(dataClz);
//                }});
//                System.err.println("           dataTokenizers : " + dataTokenizers);
//                System.err.println("           dataField : " + JSON.toJSONString(dataField));
//            }
//
//        }
//
//        lineMapper.setTokenizers(lineTokenizers);
//        lineMapper.setFieldSetMappers(fieldSetMappers);
//        // 如果包含header，需要忽略掉
////        reader.setLinesToSkip(1);
//        setLineMapper(lineMapper);
//    }
//
//
//    public static String[] getSelfFieldStr(Class clz) {
//        return Arrays.stream(clz.getDeclaredFields()).filter(e -> e.getAnnotation(FieldOrder.class) != null)
//                .sorted(Comparator.comparingInt(e -> e.getAnnotation(FieldOrder.class).order()))
//                .map(Field::getName).toArray(String[]::new);
//    }
//    public static String[] getFieldStr(Class clz) {
//        return Arrays.stream(FieldUtils.getAllFields(clz)).filter(e -> e.getAnnotation(FieldOrder.class) != null)
//                .sorted(Comparator.comparingInt(e -> e.getAnnotation(FieldOrder.class).order()))
//                .map(Field::getName).toArray(String[]::new);
//    }
//}
