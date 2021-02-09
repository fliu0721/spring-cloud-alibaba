package com.felix.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/gateway/client")
    public String test() {
        return "Hello gateway";
    }

    @GetMapping("/sentinel/test")
    public String sentinelTest() {
        return "Hello Sentinel";
    }
}
