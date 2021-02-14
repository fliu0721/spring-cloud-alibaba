package com.felix.nacos.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RefreshScope // 动态刷新
public class TestController {

    @Value("${felix}")
    private String felix;

    @GetMapping("/get1")
    public String get1() {
        return "name: " + felix;
    }
}
