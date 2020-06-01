package com.etoak.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by 86182 on 2020/5/29.
 */
public class CxfClient {
    public static void main(String[] args) {
        //JaxWsProxyFactoryBean
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        //设置wsdl地址
        factory.setAddress("http://localhost:8000/hello?wsdl");
        //设置服务接口
        factory.setServiceClass(HelloService.class);
        //设置远程服务器
        HelloService service = (HelloService)factory.create();
        System.out.println(service);
        //调用远程方法
        System.out.println(service.sayHello("CXF"));
    }
}
