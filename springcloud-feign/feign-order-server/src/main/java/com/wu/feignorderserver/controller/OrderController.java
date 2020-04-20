package com.wu.feignorderserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/20 20:38
 **/

@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("order")
    public String order(){
        return port+" this is feign order server";
    }
}
