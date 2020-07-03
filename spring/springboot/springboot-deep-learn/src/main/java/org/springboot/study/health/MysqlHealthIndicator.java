package org.springboot.study.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author chenyao
 * @date 2020/6/28 18:14
 * @description
 */
@Component
public class MysqlHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        int errorCode = 1; // perform some specific health check
        if (errorCode != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

}
