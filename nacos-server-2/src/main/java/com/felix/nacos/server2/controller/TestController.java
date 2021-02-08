package com.felix.nacos.server2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/echo/{name}")
    public String echo(@PathVariable("name") String name) {
        return "[nacos-server-2] Hello " + name;
    }
}
