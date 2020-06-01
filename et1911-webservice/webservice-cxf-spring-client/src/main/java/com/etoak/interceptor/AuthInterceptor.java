package com.etoak.interceptor;


import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;

/**
 * Created by 86182 on 2020/6/1.
 */
class AuthInInterceptor extends AbstractPhaseInterceptor<SoapMessage>{


    private String name;
    private String password;

    public AuthInInterceptor(String name,String password){
        super(Phase.PREPARE_SEND);
        this.name = name;
        this.password = password;
    }
    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        //创建文档
        Document doc = DOMUtils.createDocument();
        //创建三个节点et1911,name,password
        Element et1911 = doc.createElement("et1911");
        //创建name节点,设置用户名
        Element name = doc.createElement("name");
        name.setTextContent(this.name);
        //创建password节点设置password
        Element password = doc.createElement("password");
        password.setTextContent(this.password);

        //给et1911添加name和password节点
        et1911.appendChild(name);
        et1911.appendChild(password);

        Header header = new Header(new QName("et1911"),et1911);
        message.getHeaders().add(header);
    }
}
