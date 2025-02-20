package com.ap.appfordocker2.ap_fordocker2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.appfordocker2.ap_fordocker2.feign.App1Proxy;


@RestController
@RequestMapping("app2")
public class ControllerForApp1 {

    @Autowired
    App1Proxy app1Proxy;

    @GetMapping("app1FromApp2")
    public String getMethodName() {
        return app1Proxy.callService1();
    }
    

}
