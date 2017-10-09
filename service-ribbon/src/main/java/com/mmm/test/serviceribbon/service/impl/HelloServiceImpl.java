package com.mmm.test.serviceribbon.service.impl;

import com.mmm.test.serviceribbon.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 马孟孟【mamengmeng@msymobile.com】
 * @Date 2017/10/9 13:34
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return this.restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
    public String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
