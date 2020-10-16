package com.appleyk.dubbo.service;

import java.util.concurrent.CompletableFuture;

/**
 * <p>以最简单的Hello World为例，声明一个接口</p>
 *
 * @author Appleyk
 * @version V.0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @github https://github.com/kobeyk/dubbo-spring-boot-sample
 * @date created on 10:51 2020/10/16
 */
public interface HelloService {

    String sayHello(String name);

    /**
     * 默认方法，好处就是，加默认方法，不影响实现类，实现类想实现就复写，不想实现不用理会
     */
    default CompletableFuture<String> sayHelloAsync(String name){
        return CompletableFuture.completedFuture(sayHello(name));
    }
}
