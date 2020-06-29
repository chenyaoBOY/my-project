package org.springboot.study.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyao
 * @date 2020/6/28 18:14
 * @description
 */

@Component
public class MysqlHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("msg","this displays info msg ");
        map.put("time",new Date());
        map.put("count",1);
        builder.up().withDetails(map);
    }
}
