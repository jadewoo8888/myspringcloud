package com.wu.ribbonuserserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/20 20:47
 **/

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getUserOrder")
    public String getUserOrder(){
        String str = restTemplate.getForObject("http://feign-order-server/order",String.class);
        return str;
    }
}
