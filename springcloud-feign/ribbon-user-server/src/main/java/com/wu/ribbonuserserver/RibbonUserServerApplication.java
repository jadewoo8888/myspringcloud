package com.wu.ribbonuserserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RibbonUserServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonUserServerApplication.class, args);
    }

}
