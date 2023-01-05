package com.feng480.mapper;

import com.feng480.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author feng
 * @create 2023-01-04-12:16
 */
@Repository
public interface UserMapper {

    //查询所有
    public List<User> findAll();

    //根据id查询
    public User findById(@Param("id") Long id);

    //添加
    public Integer add(User user);

    //更新
    public Integer update(User user);

    //根据id删除
    public Integer deleteById(@Param("id") Long id);

}
