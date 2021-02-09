package com.felix.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class TestController {

    @GetMapping("/client")
    public String test() {
        return "Hello gateway";
    }
}
