package com.etoak.service.impl;

/**
 * Created by 86182 on 2020/5/29.
 */
public class JdkClient {
    public static void main(String[] args) {
        HelloServiceImplService service = new HelloServiceImplService();

        HelloServiceImpl soap = service.getHelloServiceImplPort();
        String result = soap.sayHello("WebService");
        System.out.println(result);
    }
}
