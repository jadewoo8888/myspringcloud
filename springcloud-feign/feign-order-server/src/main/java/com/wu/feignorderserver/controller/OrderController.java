package com.wu.feignorderserver.controller;

import com.wu.feignorderserver.request.OrderReq;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/20 20:38
 **/

@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("order")
    public String order(){
        return port+" this is feign order server";
    }

    //http://127.0.0.1:8762/queryOrderInfo?code=1&productName=swisse
    @GetMapping("queryOrderInfo")
    public String queryOrderInfo(@Valid OrderReq req) {
        return req.toString();
    }
}
