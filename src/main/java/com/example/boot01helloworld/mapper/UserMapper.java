package com.example.boot01helloworld.mapper;

import com.example.boot01helloworld.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author xt
 * @create 2022-09-01-20:59
 **/
@Mapper
public interface UserMapper {
    @Select("select * from user_name where name=#{name}")
    public User getuser(String name);
}
