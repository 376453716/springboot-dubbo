package com.xh.dubbo.demo;

/**
 * @author Xiong Hao
 */
public class HelloServiceImpl implements HelloService {
    public String sayHello() {
        return "Hello from remote.";
    }
}
