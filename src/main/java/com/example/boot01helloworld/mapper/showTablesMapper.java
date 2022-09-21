package com.example.boot01helloworld.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boot01helloworld.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author xt
 * @create 2022-09-05-17:21
 **/
@Mapper
public interface showTablesMapper extends BaseMapper<User> {
//    @Select("select * from user_name")
//    public void show_tables();
}
