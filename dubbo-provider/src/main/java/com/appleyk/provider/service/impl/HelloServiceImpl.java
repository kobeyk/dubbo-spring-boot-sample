package com.appleyk.provider.service.impl;

import com.appleyk.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * <p>实现接口声明模块中的接口</p>
 *
 * @author Appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk/dubbo-spring-boot-sample
 * @date created on 12:31 2020/10/16
 */
@DubboService // dubbo注解，暴露服务
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return null;
    }

}
