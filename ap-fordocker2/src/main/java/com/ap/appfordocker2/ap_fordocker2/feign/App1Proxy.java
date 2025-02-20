package com.ap.appfordocker2.ap_fordocker2.feign;

import org.springframework.stereotype.Service;

@Service
public class App1Proxy {

    private final App1Client app1Client;

    public App1Proxy(App1Client app1Client) {
        this.app1Client = app1Client;
    }

    public String callService1() {
        return app1Client.callApp1();
    }
}