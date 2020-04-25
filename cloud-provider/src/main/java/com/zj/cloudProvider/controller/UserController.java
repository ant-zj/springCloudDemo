package com.zj.cloudProvider.controller;


import com.zj.api.entity.CommonResult;
import com.zj.api.entity.User;
import com.zj.cloudProvider.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@Slf4j
public class UserController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private UserService userService;


    @GetMapping(value = "/user/get/{id}")
    public CommonResult queryUser(@PathVariable Long id){
        log.info("");
        User user = userService.getUser(id);
        log.info("进入提供者-------------------------"+ LocalDate.now());
        return new CommonResult(200,"",user);
    }
}
