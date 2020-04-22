package com.wu.feignuserserver.controller;

import com.wu.feignuserserver.request.OrderReq;
import com.wu.feignuserserver.server.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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
    //因feign问题，无法访问
    /*@GetMapping("queryOrderInfoA")
    String queryOrderInfoA(@Valid OrderReq req) {
        return orderFeign.queryOrderInfoA(req);
    }*/

    //http://127.0.0.1:8763/queryOrderInfo?code=1&productName=swisse
    @GetMapping("queryOrderInfoB")
    String queryOrderInfoB(Integer code, String productName) {
        return orderFeign.queryOrderInfoB(code, productName);
    }
}
