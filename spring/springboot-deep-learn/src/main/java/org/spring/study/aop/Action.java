package org.spring.study.aop;

import java.lang.annotation.*;

/**
 * 用于aop切点位置  指定方法使其具有aop功能
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String value() default "";
}
