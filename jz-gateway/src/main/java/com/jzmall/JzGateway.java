package com.jzmall;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class JzGateway {
    public static void main(String[] args) {
        SpringApplication.run(JzGateway.class);
    }
}
