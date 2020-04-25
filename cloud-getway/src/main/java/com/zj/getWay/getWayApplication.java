package com.zj.getWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class getWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(getWayApplication.class,args);
    }


}
