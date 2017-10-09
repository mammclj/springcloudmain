package com.mmm.test.serviceribbon.controller;

import com.mmm.test.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 马孟孟【mamengmeng@msymobile.com】
 * @Date 2017/10/9 13:39
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return this.helloService.hiService(name);
    }
}
