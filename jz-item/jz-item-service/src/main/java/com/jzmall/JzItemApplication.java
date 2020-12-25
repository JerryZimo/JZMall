package com.jzmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.jzmall.item.mapper")
public class JzItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(JzItemApplication.class);
    }
}
