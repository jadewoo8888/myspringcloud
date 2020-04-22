package com.wu.feignuserserver.server;

import com.wu.feignuserserver.request.OrderReq;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/4/20 20:45
 **/
@FeignClient("feign-order-server")//服务提供者名称
public interface OrderFeign {

    @GetMapping("order")//服务提供者的接口名称
    String order();

    //无法访问，get不支持pojo参数。"error":"Method Not Allowed","message":"Request method 'POST' not supported","path":"/queryOrderInfo"
    //@GetMapping("queryOrderInfo")
    //String queryOrderInfoA(@Valid OrderReq req);

    @GetMapping("queryOrderInfo")
    String queryOrderInfoB(@RequestParam(name = "code") Integer code, @RequestParam(name = "productName") String productName);
}
