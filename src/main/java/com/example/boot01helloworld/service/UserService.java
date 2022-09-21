package com.example.boot01helloworld.service;

import com.example.boot01helloworld.bean.User;
import org.springframework.stereotype.Service;

/**
 * @author xt
 * @create 2022-09-01-21:01
 **/
public interface UserService {
    public User getUserById(String name);
}
