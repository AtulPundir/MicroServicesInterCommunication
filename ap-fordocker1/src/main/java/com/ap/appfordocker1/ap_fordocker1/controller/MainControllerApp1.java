package com.ap.appfordocker1.ap_fordocker1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ap.appfordocker1.ap_fordocker1.service.MainServiceApp1;


@RestController
@RequestMapping("app1")
public class MainControllerApp1 {
    
    @Autowired
    MainServiceApp1 mainService;

    @GetMapping("getApp1")
    public String getMessage(@RequestParam(required = false) String param) {
        return mainService.getMessage();
    }

    @GetMapping("getApp1FromApp2")
    public String getMethodName() {
        return mainService.getMessageForApp2();
    }
    
    @GetMapping("getApp2FromApp1")
    public String getApp2FromApp1(@RequestParam(required = false) String param) {
        return mainService.getApp2FromApp1();
    }
    

}
