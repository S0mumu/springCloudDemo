package com.demo.order.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.demo.order.mapper")   // 扫描Mapper接口，整合MyBatis
public class MyBatisConfig {

}
