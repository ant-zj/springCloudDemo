package com.zj.cloudFeign.controller;

import com.zj.api.entity.CommonResult;
import com.zj.api.entity.User;
import com.zj.cloudFeign.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springCloudDemo
 * @description: controller
 * @author: zj
 * @create: 2020-04-25 23:51
 **/
@RestController
@Slf4j
public class FeignController {
    @Resource
    private UserService userService;

    @GetMapping(value = "/user/get/{id}")
    public CommonResult<User> getUser(@PathVariable("id") Long id){

       return new CommonResult(200,"",userService.queryUser(id));

    }
}
