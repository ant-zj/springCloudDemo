package com.zj.cloudConsumer.controller;


import com.zj.api.entity.CommonResult;
import com.zj.api.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@RestController
@Slf4j
public class UserController {

    private static final String URL = "http://cloud-provider";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value ="/user/get/{id}")
    public CommonResult<User> getUer(@PathVariable Long id){
        log.info("进入消费者"+ LocalDate.now());
        return restTemplate.getForObject(URL+"/user/get/1", CommonResult.class);
    }

}
