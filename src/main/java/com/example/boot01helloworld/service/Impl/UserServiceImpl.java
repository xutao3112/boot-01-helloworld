package com.example.boot01helloworld.service.Impl;

import com.example.boot01helloworld.bean.User;
import com.example.boot01helloworld.mapper.UserMapper;
import com.example.boot01helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xt
 * @create 2022-09-01-21:03
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUserById(String name) {
        return userMapper.getuser(name);
    }
}