package com.etoak.service;

import javax.jws.WebService;

/**
 * Created by 86182 on 2020/5/29.
 */
/*
* 表示这是一个web service接口
* z在接口和实现类都必须加上
* */
@WebService
public interface HelloService {

    String sayHello(String name);
}
