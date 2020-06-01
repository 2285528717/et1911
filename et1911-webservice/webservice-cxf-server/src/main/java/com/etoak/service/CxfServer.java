package com.etoak.service;

import com.etoak.service.impl.HelloServiceImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created by 86182 on 2020/5/29.
 */
public class CxfServer {
    public static void main(String[] args) {
        //创建JaxWSServerFactory
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        //设置wsdl地址
        factoryBean.setAddress("http://localhost:8000/hello");
        //设置发布的服务接口
        factoryBean.setServiceClass(HelloService.class);
        //设置发布的服务实现
        factoryBean.setServiceBean(new HelloServiceImpl());
        //创建服务,并调用start()启动
        Server server = factoryBean.create();
        server.start();
        System.out.println("随便写");
    }
}
