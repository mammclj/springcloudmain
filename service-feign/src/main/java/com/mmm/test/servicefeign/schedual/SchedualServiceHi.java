package com.mmm.test.servicefeign.schedual;

import com.mmm.test.servicefeign.schedual.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping("/hi")
    String sayHiFormClientOne(@RequestParam(value="name") String name);
}
