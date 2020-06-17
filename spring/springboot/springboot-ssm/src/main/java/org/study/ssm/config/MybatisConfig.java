package org.study.ssm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenyao
 * @date 2020/5/27 14:00
 * @description
 */

@Configuration
@MapperScan("org.**.mapper")
public class MybatisConfig {
}
