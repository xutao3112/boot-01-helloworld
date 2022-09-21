package com.example.boot01helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xt
 * @create 2022-09-01-16:18
 **/
@RestController
public class ControllerTest {

    @GetMapping("car/{id}/owner/{name}")
    public Map<String, Object> getcar(@PathVariable("id") Integer id,
                                      @PathVariable("name") String name,
                                      @RequestHeader Map<String,String> header) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("header", header);
        return map;
    }
}
