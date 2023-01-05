package com.feng480.controller;

import com.feng480.entity.User;
import com.feng480.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author feng
 * @create 2023-01-04-14:01
 */

@RestController
@CrossOrigin  //允许跨域，其他的服务器能向该控制器的地址发送请求
public class UserController {

    @Autowired
    private UserService userService;

    //查询所有
    @GetMapping(value = "/user/findAll")
    public List<User> findAll(){
        List<User> userList = userService.findAll();
        return userList;
    }

    //根据id查询
    @GetMapping(value = "/user/findById/{id}")
    //@PathVariable：rest风格 解决页面传进来的名称和本地不同
    public User findById(@PathVariable("id") Long id){
        User user = userService.findById(id);
        return user;
    }

    //添加
    @PostMapping(value = "/user/add")
    public Map<String, Object> add(User user){
        Map<String, Object> map = userService.add(user);
        return map;
    }

    //更新
    @PostMapping(value = "/user/update")
    public Map<String, Object> update(User user){
        Map<String, Object> map = userService.update(user);
        return map;
    }

    //根据id删除
    @GetMapping(value = "/user/deleteById/{id}")
    public Map<String, Object> deleteById(@PathVariable("id")Long id){
        Map<String, Object> map = userService.deleteById(id);
        return map;

    }
    //根据删除
    public void say(){
        
    }

}
