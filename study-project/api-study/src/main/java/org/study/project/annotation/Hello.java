package org.study.project.annotation;

import java.lang.annotation.*;

/**
 * @author chenyao
 * @date 2019/12/12 11:32
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Hello {
    String value() default "";
}
