package com.xh.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Xiong Hao
 */
public class HelloServiceConsumer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        context.start();
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello());
    }
}
