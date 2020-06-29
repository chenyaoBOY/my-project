package org.springboot.study;

import org.springboot.study.config.BeanConfig;
import org.springboot.study.entity.UserChina;
import org.springboot.study.entity.UserJapan;
import org.springboot.study.entity.UserParent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenyao
 * @date 2020/6/28 17:53
 * @description
 */

public class Application4Annotation {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(BeanConfig.class);

        context.refresh();

        UserParent userParent = context.getBean(UserParent.class);
        UserChina userChina = context.getBean(UserChina.class);

        System.out.println(userParent.getName());
        System.out.println(userChina.getCountry());

        context.getBean(UserJapan.class);

    }
}
