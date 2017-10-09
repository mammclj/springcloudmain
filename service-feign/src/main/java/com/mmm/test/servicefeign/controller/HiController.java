package com.mmm.test.servicefeign.controller;

import com.mmm.test.servicefeign.schedual.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 马孟孟【mamengmeng@msymobile.com】
 * @Date 2017/10/9 14:22
 */
@RestController
public class HiController {
    @Autowired
    private SchedualServiceHi schedualServiceHi;
    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name){
        return this.schedualServiceHi.sayHiFormClientOne(name);
    }
}
