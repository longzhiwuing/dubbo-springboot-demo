package com.lzwing.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lzwing.dubbo.api.DemoService;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: chenzhongyong@cecdat.com
 * Date: 2018/5/27
 * Time: 17:26
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot )";
    }

}
