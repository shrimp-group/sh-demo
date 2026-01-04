package com.wkclz.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan(basePackages = {"com.wkclz.demo"})
@MapperScan(basePackages = {"com.wkclz.demo.mapper"})
public class DemoAutoConfig {
}


