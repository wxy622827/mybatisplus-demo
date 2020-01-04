package com.atguigu.mybatisplus.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.mybatisplus.demo.mapper ")
public class MybatisplusDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusDemoApplication.class, args);
    }

}
