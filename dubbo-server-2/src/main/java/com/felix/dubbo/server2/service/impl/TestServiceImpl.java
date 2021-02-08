package com.felix.dubbo.server2.service.impl;

import com.felix.core.dubbo.api.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author felix
 */
@DubboService(loadbalance = "roundrobin")
public class TestServiceImpl implements TestService {
    @Override
    public String testEcho(String msg) {
        return "[dubbo-server-2] Hello " + msg;
    }
}
