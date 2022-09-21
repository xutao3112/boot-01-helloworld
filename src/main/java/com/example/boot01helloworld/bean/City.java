package com.example.boot01helloworld.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author xt
 * @create 2022-09-01-18:54
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("city")
public class City {
    private Long id;
    private String name;
    private String CountryCode;
    private String District;
    private Integer Population;
}
