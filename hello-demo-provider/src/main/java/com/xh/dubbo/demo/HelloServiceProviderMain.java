package com.xh.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Xiong Hao
 */
public class HelloServiceProviderMain {


    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
//        context.start();
        System.in.read();
    }
}
