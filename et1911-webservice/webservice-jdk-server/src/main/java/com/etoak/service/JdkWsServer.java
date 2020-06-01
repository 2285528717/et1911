package com.etoak.service;

import com.etoak.service.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by 86182 on 2020/5/29.
 */
public class JdkWsServer {
    public static void main(String[] args) {
        //两个参数
        //参数1:发布地址(wsdl地址)
        //参数2:暴露的服务
        Endpoint.publish("http://localhost:8080/hello",new HelloServiceImpl());
        System.out.println("Server start");
    }
}
