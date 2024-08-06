package com.merkle.SpringAI;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//@MapperScan(basePackages="com.merkle.SpringAI.dao.mapper")
//@PropertySource(value = "file:./config/application.yml")
@MapperScan(basePackages="com.merkle.SpringAI.dao.mapper")
@SpringBootApplication
public class SpringAiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAiDemoApplication.class, args);
    }

}
