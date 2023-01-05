package com.feng480.service;

import com.feng480.entity.User;


import java.util.List;
import java.util.Map;

/**
 * @author feng
 * @create 2023-01-04-13:46
 */


public interface UserService {
    //查询所有
    public List<User> findAll();

    //根据id查询
    public User findById(Long id);

    //添加
    public Map<String, Object> add(User user);

    //更新
    public Map<String, Object> update(User user);

    //根据id删除
    public Map<String, Object> deleteById(Long id);
}
