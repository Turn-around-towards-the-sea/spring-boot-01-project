package com.feng480.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author feng
 * @create 2023-01-04-12:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private Long id;
    private String userName;
    private String password;
    private String sex;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd") //区别于fastjson，转json的注解改变了，因为springboot使用jackson
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
}
