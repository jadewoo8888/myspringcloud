package com.wu.springcloudhystrix.controller;

import com.wu.springcloudhystrix.service.OrderFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/2 11:26
 **/
@RestController
public class HystrixFeignClassController {


    @Autowired
   OrderFeignApi orderFeignApi;

    @GetMapping("order/class")
    public String order() {
        return orderFeignApi.order();
    }

}
