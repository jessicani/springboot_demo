package com.chixing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SampleDemo {
    @RequestMapping("/")
    public String get(){
        return "Hello,this is my first Springboot_demo";
    }

}
