package com.felix.client.feign.controller;

import com.felix.client.feign.service.FeignTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author felix
 */
@RestController
@RequestMapping("/feign")
public class FeignTestController {
    @Resource
    private FeignTestService feignTestService;

    @GetMapping("/echo")
    public String echo() {
        return feignTestService.echo("felix");
    }
}
