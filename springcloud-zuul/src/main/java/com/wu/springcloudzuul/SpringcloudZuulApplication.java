package com.wu.springcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy   //开启路由网关
@SpringBootApplication
public class SpringcloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulApplication.class, args);
    }

}
