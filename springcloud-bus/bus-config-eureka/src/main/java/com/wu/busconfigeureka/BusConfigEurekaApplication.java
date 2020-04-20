package com.wu.busconfigeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BusConfigEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusConfigEurekaApplication.class, args);
        System.out.println("bus 注册中心服务启动...");
    }

}
