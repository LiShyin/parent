package com.example.sever2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(@RequestParam String name){
        return "测试接口2，接口参数为："+name;
    }
    @RequestMapping(value = "test2")
    public String test2(){
        return "测试接口2";
    }
}
