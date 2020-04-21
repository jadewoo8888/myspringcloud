package com.wu.springcloudhystrix.service;

import org.springframework.stereotype.Component;

@Component
public class OrderFeignApiHystric implements OrderFeignApi {
    @Override
    public String order() {
        return "sorry, you are fail,";
    }
}