package com.example.gateway1;

import com.example.gateway1.server.TestServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestServer testServer;

    @GetMapping("/test")
    public String test(String name){
        return testServer.test(name);
    }

    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }
}
