package com.muzg.cgis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.muzg.cgis.dao")
public class MybatisConfig {
}
