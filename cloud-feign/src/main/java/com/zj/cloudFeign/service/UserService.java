package com.zj.cloudFeign.service;

import com.zj.api.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: springCloudDemo
 * @description: 使用feign调用
 * @author: zj
 * @create: 2020-04-25 23:24
 **/
@Component
@FeignClient(value = "CLOUD-PROVIDER")
public interface UserService {
    @GetMapping(value = "/user/get/{id}")
    CommonResult queryUser(@PathVariable("id") Long id);
}
