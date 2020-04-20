package com.wu.feignorderserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FeignOrderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignOrderServerApplication.class, args);
    }

}
