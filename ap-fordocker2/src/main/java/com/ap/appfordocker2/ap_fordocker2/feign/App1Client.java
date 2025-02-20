package com.ap.appfordocker2.ap_fordocker2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app1", url = "http://localhost:8081")
public interface App1Client {
    
    @GetMapping("/app1/getApp1FromApp2")
    String callApp1();
}