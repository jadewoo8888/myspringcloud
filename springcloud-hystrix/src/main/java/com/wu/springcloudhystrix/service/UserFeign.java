package com.wu.springcloudhystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/2 11:14
 **/
@FeignClient(value = "feign-user-server")
public interface UserFeign {

    @GetMapping("getUser")
    String getUser();
}
