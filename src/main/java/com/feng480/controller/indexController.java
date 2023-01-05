package com.feng480.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot项目的第一个控制器
 *
 * @author feng
 * @create 2023-01-04-10:28
 */
//@Controller
@RestController //@Controller + @ResponseBody
public class indexController {

    @RequestMapping(value = "/index")
//    @ResponseBody
    public String index(){
        System.out.println("index");
        return "index";
    }

}
