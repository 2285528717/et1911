package com.etoak.service.impl;

import com.etoak.service.HelloService;

import javax.jws.WebService;

/**
 * Created by 86182 on 2020/5/29.
 */
@WebService //接口和实现类都要加上@WebService
public class HelloServiceImpl  implements HelloService{

    @Override
    public String sayHello(String name) {
        System.out.println("sayHello invoke");
        return "Hello " + name;
    }
}
