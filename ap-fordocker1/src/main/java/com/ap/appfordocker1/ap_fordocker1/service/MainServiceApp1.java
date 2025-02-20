package com.ap.appfordocker1.ap_fordocker1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceApp1 {

    @Autowired
    App2Proxy app2Proxy;

    public String getMessage() {
       return "message from app1111";
    }

    public String getApp2FromApp1() {
        return app2Proxy.callAPP2();
    }

    public String getMessageForApp2() {
        return "This message is from app1 intended for app2 being called using feign in app2";
    }

}
