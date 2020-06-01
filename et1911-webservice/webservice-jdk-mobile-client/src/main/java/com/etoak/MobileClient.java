package com.etoak;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

/**
 * Created by 86182 on 2020/5/29.
 */

public class MobileClient {
    public static void main(String[] args) {
        MobileCodeWS ws = new MobileCodeWS();
        MobileCodeWSSoap soap = ws.getMobileCodeWSSoap();
        String result = soap.getMobileCodeInfo("13830084242","");
        System.out.println(result);
    }
}
