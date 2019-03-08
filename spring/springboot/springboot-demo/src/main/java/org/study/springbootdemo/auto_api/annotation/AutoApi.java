package org.study.springbootdemo.auto_api.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoApi {
    String value() default "";
}
