package com.ap.appfordocker2.ap_fordocker2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ap.appfordocker2.ap_fordocker2.service.MainServiceApp2;


@RestController
@RequestMapping("app2")
public class MainControllerApp2 {
    
    @Autowired
    MainServiceApp2 mainService;

    @GetMapping("getApp2")
    public String getMethodName(@RequestParam(required = false) String param) {
        return mainService.getMessage();
    }
    

}
