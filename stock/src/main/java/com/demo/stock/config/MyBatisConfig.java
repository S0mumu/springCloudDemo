package com.demo.stock.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.demo.stock.mapper")
public class MyBatisConfig {
}
