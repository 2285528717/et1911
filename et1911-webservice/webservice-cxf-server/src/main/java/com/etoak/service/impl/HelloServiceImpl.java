package com.etoak.service.impl;

import com.etoak.service.HelloService;

import javax.jws.WebService;

/**
 * Created by 86182 on 2020/5/29.
 */
@WebService(serviceName = "HelloServiceWS",
        portName = "HelloServiceWSPort")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("客户端被调用");
        return "null"+ name;
    }
}
