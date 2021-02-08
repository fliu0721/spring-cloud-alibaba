package com.felix.dubbo.server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DubboServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboServer2Application.class, args);
    }

}