package com.sky.annotation;


import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解：用于标识某个方法需要进行功能字段自动填充处理
 */
@Target(ElementType.METHOD)// 标识注解作用在方法上
@Retention(RetentionPolicy.RUNTIME)// 注解保留时间，运行时保留
public @interface AutoFill {
    // 设置填充逻辑对应的数据库操作类型: INSERT UPDATE
    OperationType value();
}
