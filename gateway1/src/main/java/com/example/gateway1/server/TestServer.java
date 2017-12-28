package com.example.gateway1.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class TestServer {
    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String test(String name){
        try {
            return restTemplate.getForObject("http://server/test?name="+name,String.class);
        } catch (RestClientException e) {
            return "has error!";
        }
    }

    public String hiError(String name) {
        return "has error!";
//        try {
//            return restTemplate.getForObject("http://server/test?name="+name,String.class);
//        } catch (RestClientException e) {
//            return "has error!";
//        }
    }
}
