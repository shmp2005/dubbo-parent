package com.zhongba.dubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhongba.commonservice.domain.City;
import com.zhongba.commonservice.service.CityService;
import org.springframework.stereotype.Component;

/**
 * 中巴价值投资研习社
 *
 * @ author: tangjianhua
 * @ date: 2018/7/3.
 */

@Component
public class CityConsumerService {

    @Reference(version = "1.0.0")
    CityService cityService;

    public City printCity() {
        String cityName = "温岭";
        City city = cityService.findCityByName(cityName);
        System.out.println(city.toString());
        return city;
    }
}
