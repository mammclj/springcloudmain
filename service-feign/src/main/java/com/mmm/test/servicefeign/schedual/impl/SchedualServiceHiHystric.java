package com.mmm.test.servicefeign.schedual.impl;

import com.mmm.test.servicefeign.schedual.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author 马孟孟【mamengmeng@msymobile.com】
 * @Date 2017/10/9 15:40
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFormClientOne(String name) {
        return "sorry "+name;
    }
}
