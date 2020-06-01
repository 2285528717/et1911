package com.etoak.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by 86182 on 2020/5/29.
 */
@WebService(serviceName = "HelloServiceWS",portName = "HelloServiceWSPort")
public interface HelloService {
    @WebMethod
    String sayHello(String name);
}
