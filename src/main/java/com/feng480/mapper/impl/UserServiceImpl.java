package com.feng480.mapper.impl;

import com.feng480.entity.User;
import com.feng480.mapper.UserMapper;
import com.feng480.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author feng
 * @create 2023-01-04-13:48
 */

@Service
@Transactional //当前所有的service都支持事务
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public Map<String, Object> add(User user) {
        Integer result = userMapper.add(user);
        Map<String, Object> map = new HashMap<>();
        if(result > 0){
            map.put("code", 200);
            map.put("msg", "添加成功");
        }else {
            map.put("code", 400);
            map.put("msg", "添加失败");
        }
        return map;
    }

    @Override
    public Map<String, Object> update(User user) {
        Integer result = userMapper.update(user);
        Map<String, Object> map = new HashMap<>();
        if(result > 0){
            map.put("code", 200);
            map.put("msg", "更新成功");
        }else {
            map.put("code", 400);
            map.put("msg", "更新失败");
        }
        return map;

    }

    @Override
    public Map<String, Object> deleteById(Long id) {
        Integer result = userMapper.deleteById(id);
        Map<String, Object> map = new HashMap<>();
        if(result > 0){
            map.put("code", 200);
            map.put("msg", "删除成功");
        }else {
            map.put("code", 400);
            map.put("msg", "删除失败");
        }
        return map;
    }
}
