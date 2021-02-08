package com.felix.nacos.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosServer1Application.class, args);
    }

}
