package com.zhongba.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhongba.commonservice.domain.City;
import com.zhongba.commonservice.service.CityService;
import com.zhongba.dubboconsumer.service.CityConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 中巴价值投资研习社
 *
 * @ author: tangjianhua
 * @ date: 2018/7/3.
 */

@RestController
public class HelloController {
    @Autowired
    CityConsumerService cityConsumerService;

    @GetMapping("/")
    public City sayHello() {
        City city = cityConsumerService.printCity();
        System.out.println("done");
        return city;
    }
}
