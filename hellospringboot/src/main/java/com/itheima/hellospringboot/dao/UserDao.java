package com.itheima.hellospringboot.dao;

import com.itheima.hellospringboot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from kj_user")
    public List<User> findAll();
}
