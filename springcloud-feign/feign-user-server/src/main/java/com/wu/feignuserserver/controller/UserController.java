package com.wu.feignuserserver.controller;

import com.wu.feignuserserver.server.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/20 20:47
 **/

@RestController
public class UserController {

    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping("/getUserOrder")
    public String getUserOrder(){
        String str = orderFeign.order();
        return str;
    }

    @RequestMapping("/getUser")
    public String getUser(){
        return "feign user server";
    }
}
