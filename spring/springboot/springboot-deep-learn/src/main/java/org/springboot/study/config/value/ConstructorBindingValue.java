package org.springboot.study.config.value;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * @author chenyao
 * @date 2020/7/14 16:40
 * @description 通过构造器注入 用途：在构造器中可通过@DefaultValue传入默认参数
 * 需要在启动类上家 @ConfigurationPropertiesScan注解
 * 通过 @ConfigurationPropertiesScan将带有@ConfigurationProperties注解的bean注入到spring容器中，
 * bean的默认名称为 prefix-类的全限定名
 */
@ConstructorBinding
@ConfigurationProperties(prefix = "acme")
public class ConstructorBindingValue {
    private static final Logger log = LoggerFactory.getLogger(ConstructorBindingValue.class);
    private String name;
    private String address;
    private Integer age;
    private Security security;/**内部类必须是静态内部类 外部可以访问 才能set值*/

    public ConstructorBindingValue(String name, String address,
                                   @DefaultValue("18") Integer age,
                                   @DefaultValue Security security) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.security = security;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   public static class Security{
        private String key;
        private String sign;
        public Security( @DefaultValue("key") String key, @DefaultValue("1234") String sign) {
            this.key = key;
            this.sign = sign;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }
    }
}
