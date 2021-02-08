package com.felix.dubbo.client1.controller;

import com.felix.core.dubbo.api.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @DubboReference
    private TestService testService;

    @RequestMapping("/echo")
    public String echo() {
        return testService.testEcho("client-1 ");
    }
}
