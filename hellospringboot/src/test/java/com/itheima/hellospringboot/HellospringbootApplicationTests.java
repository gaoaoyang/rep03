package com.itheima.hellospringboot;

import com.itheima.hellospringboot.dao.UserDao;
import com.itheima.hellospringboot.domain.User;
import org.junit.jupiter.api.Test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@MapperScan(value = "com.itheima.hellospringboot.dao")
class HellospringbootApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    public void test01(){
        List<User> all = userDao.findAll();
        System.out.println(all);
    }
    @Test
    void contextLoads() {
    }

}
