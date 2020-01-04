package com.atguigu.mybatisplus.demo.pojo;

import lombok.Data;

/**
 * @author wxy
 * @create 2020-01-04 10:28
 */
    @Data
    public class User {
        private Long id;
        private String name;
        private Integer age;
        private String email;
    }

