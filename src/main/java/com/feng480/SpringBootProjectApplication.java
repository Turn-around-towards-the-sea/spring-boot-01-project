package com.feng480;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot项目的主启动器
 *
 *
 * @author feng
 * @create 2023-01-04-10:17
 */

//@SpringBootApplication:  自动完成你的springboot一些基础操作
/*
@ComponentScan: 组件扫描
@SpringBootConfiguration : 提供了springboot项目的基础配置
@EnableAutoConfiguration ： 开启springboot的自动配置
*/
@SpringBootApplication
//扫描dao层接口
@MapperScan(value = {"com.feng480.mapper"})
public class SpringBootProjectApplication {
    public static void main(String[] args) {
        //在这个main方法中可以直接一个内置tomcat
        //SpringApplication.run() : 运行一个springboot项目
        SpringApplication.run(SpringBootProjectApplication.class,args);
    }
}
