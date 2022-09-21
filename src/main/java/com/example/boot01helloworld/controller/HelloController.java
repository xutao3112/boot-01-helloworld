package com.example.boot01helloworld.controller;

import com.example.boot01helloworld.bean.City;
import com.example.boot01helloworld.bean.Person;
import com.example.boot01helloworld.bean.User;
import com.example.boot01helloworld.service.CityService;
import com.example.boot01helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import java.util.List;

/**
 * @author xt
 * @create 2022-08-31-22:23
 **/
@RestController
public class HelloController {
    @Autowired
    private Person person;

    @RequestMapping("/person")
    public Person person() {
        return person;
    }

    @Autowired
    CityService cityService;

    @GetMapping("/city")
    public City showCity() {
        List<City> citys = cityService.list();
        for (City c : citys) {
            System.out.println(c);
        }
        return cityService.list().get(0);
    }
//    @GetMapping("/city")
//    public City getcity(@RequestParam("id") Long id) {
//        return cityService.getcityByid(id);
//    }

    @Autowired
    UserService userService;
    @GetMapping("/user")
    public User getuser(@RequestParam("name") String name) {
        return userService.getUserById(name);
    }
}
