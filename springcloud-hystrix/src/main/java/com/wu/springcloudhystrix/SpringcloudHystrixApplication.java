package com.wu.springcloudhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

//启动方式
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
@SpringBootApplication
public class SpringcloudHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixApplication.class, args);
    }

}
