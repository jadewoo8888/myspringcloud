package com.wu.springcloudzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2020/3/31 16:20
 **/
//@Component  //这个不要随便开启
@Slf4j
public class MyZuulFilter extends ZuulFilter {

    @Value("${server.port}")
    private String port;

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("网关端口："+port);
        return null;
    }
}
