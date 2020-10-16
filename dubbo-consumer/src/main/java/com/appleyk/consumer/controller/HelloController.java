package com.appleyk.consumer.controller;

import com.appleyk.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

/**
 * <p>消费Hello服务接口</p>
 *
 * @author Appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk/dubbo-spring-boot-sample
 * @date created on 16:11 2020/10/16
 */
@CrossOrigin
@RestController
@RequestMapping("/dubbo")
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @GetMapping("hello/{name}")
    public String hello(@PathVariable("name") String name){
        String hello = helloService.sayHello(name);
        System.out.println(hello);
        return helloService.sayHello(hello);
    }

}
