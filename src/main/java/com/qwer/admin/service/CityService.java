package com.qwer.admin.service;

import com.qwer.admin.bean.City;
import com.qwer.admin.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface CityService {

    City getById(Long id);

    void saveCity(City city);

}
