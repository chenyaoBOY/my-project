package org.springboot.study;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author chenyao
 * @date 2020/5/20 16:19
 * @description
 */
public class StringCache implements InitializingBean {

    @Value("${app.name:jiji}")
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
