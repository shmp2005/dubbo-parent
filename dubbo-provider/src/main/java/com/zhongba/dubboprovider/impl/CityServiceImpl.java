package com.zhongba.dubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhongba.commonservice.domain.City;
import com.zhongba.commonservice.service.CityService;

/**
 * 中巴价值投资研习社
 *
 * @ author: tangjianhua
 * @ date: 2018/7/3.
 */
@Service(version = "1.0.0")
public class CityServiceImpl implements CityService {
    @Override
    public City findCityByName(String cityName) {
        return new City(1L, 2L, "温岭", "是我的故乡");
    }
}
