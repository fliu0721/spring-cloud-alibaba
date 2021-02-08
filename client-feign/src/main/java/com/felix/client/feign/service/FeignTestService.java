package com.felix.client.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 接口式编程
 *
 * @author felix
 */
@FeignClient("nacos-server")
public interface FeignTestService {

    @PostMapping("/test/echo/{name}")
    String echo(@PathVariable("name") String name);
}
