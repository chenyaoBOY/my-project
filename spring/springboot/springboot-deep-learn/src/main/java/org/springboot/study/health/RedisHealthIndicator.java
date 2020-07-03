package org.springboot.study.health;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyao
 * @date 2020/6/29 16:37
 * @description springboot监控器Actuator
 * 可以实现健康检查、查看应用中的bean、获取环境属性等等 具体看springboot官网的Actuator介绍
 * 1.引入springboot-starter-actuator
 * 2.实现 AbstractHealthIndicator/HealthIndicator
 * 3.将bean注入到spring
 * 4.注意 功能的开启需要配置
 * management:
 *   endpoint:
 *     health:
 *       enabled: true
 *       show-details: always
 */
@Component
public class RedisHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "this displays info msg ");
        map.put("time", new Date());
        map.put("count", 1);
        builder.up().withDetail("database", "mysql");
        builder.withDetail("hello", JSONObject.toJSONString(map));
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
