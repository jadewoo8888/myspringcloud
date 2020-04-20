package com.wu.feignuserserver.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/20 20:45
 **/
@FeignClient("feign-order-server")
public interface OrderFeign {

    @GetMapping("order")
    String order();
}
