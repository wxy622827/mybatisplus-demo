package com.atguigu.mybatisplus.demo.mapper;

import com.atguigu.mybatisplus.demo.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wxy
 * @create 2020-01-04 10:29
 */
public interface UserMapper extends BaseMapper<User> {
      @Select("select count(*) from user")
       public Integer queryUser();

      public List<User> queryAllUser();
}
