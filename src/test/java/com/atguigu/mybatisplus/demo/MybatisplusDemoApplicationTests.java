package com.atguigu.mybatisplus.demo;

import com.atguigu.mybatisplus.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MybatisplusDemoApplicationTests {

    @Resource
    private  UserMapper userMapper;
    @Test
    void contextLoads() {
//        //2 表示当前页，3 本页的大小    QueryWrapper  查询条件
//        IPage<User> page = this.userMapper.selectPage(new Page<>(2, 3), new QueryWrapper<>());
//        System.out.println(page.getCurrent());
//        System.out.println( page.getRecords());
//        System.out.println(page.getTotal());
//        System.out.println(page.getSize());
//          System.out.println(this.userMapper.queryUser());
//        System.out.println(this.userMapper.selectById(1));
        System.out.println(this.userMapper.queryAllUser());
    }

}
