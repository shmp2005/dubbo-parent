package com.zhongba.commonservice.service;

import com.zhongba.commonservice.domain.City;

/**
 * 中巴价值投资研习社
 *
 * @ author: tangjianhua
 * @ date: 2018/7/3.
 */
public interface CityService {
    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    City findCityByName(String cityName);
}
