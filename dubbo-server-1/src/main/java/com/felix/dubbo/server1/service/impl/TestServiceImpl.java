package com.felix.dubbo.server1.service.impl;

import com.felix.core.dubbo.api.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author felix
 */
// loadbalance 默认为random，可选roundrobin、lastactive、一致性Hash
@DubboService(loadbalance = "roundrobin")
public class TestServiceImpl implements TestService {
    @Override
    public String testEcho(String msg) {
        return "[dubbo-server-1] Hello " + msg;
    }
}
