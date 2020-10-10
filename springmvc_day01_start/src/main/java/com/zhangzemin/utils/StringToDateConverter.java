package com.zhangzemin.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义类型转换器
 */
public class StringToDateConverter implements Converter<String, Date> {
    /**
     * 用于支持2019-12-30格式的日期
     * @param source
     * @return
     */
    @Override
    public Date convert(String source) {
        DateFormat dateFormat = null;

        try {
            if(StringUtils.isEmpty(source)){
                throw new NullPointerException("请输入要转换的日期");
            }
            dateFormat = new SimpleDateFormat("yyy-MM-dd");
            Date date = dateFormat.parse(source);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException("输入日期有误");
        }
    }
}
