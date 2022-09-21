package com.example.boot01helloworld.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boot01helloworld.bean.City;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xt
 * @create 2022-09-01-18:52
 **/
@Mapper
public interface CityMapper extends BaseMapper<City> {
   // public City getcity(Long id);
}
