package com.wu.busconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class BusConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusConfigServerApplication.class, args);
        System.out.println("bus配置中心服务端启动成功!.");
    }

}
