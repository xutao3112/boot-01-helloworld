package com.example.boot01helloworld.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boot01helloworld.bean.City;
import com.example.boot01helloworld.mapper.CityMapper;
import com.example.boot01helloworld.mapper.UserMapper;
import com.example.boot01helloworld.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xt
 * @create 2022-09-01-19:15
 **/
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService {
   
//    @Autowired
//    CityMapper cityMapper;
//
//    @Override
//    public City getcityByid(Long id) {
//
//        return cityMapper.getcity(id);

}
