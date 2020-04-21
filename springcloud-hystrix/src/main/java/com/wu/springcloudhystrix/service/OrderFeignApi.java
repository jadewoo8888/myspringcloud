package com.wu.springcloudhystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "feign-order-server",fallback = OrderFeignApiHystric.class)
public interface OrderFeignApi {
    @RequestMapping(value = "order",method = RequestMethod.GET)
    String order();
}

