package com.zj.cloudConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class consumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(consumerApplication.class,args);
    }
}
