package com.itheima.hellospringboot.test;


import com.itheima.hellospringboot.dao.UserDao;
import com.itheima.hellospringboot.domain.User;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
@MapperScan(value = "com.itheima.hellospringboot.dao")
class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void test01(){
        List<User> all = userDao.findAll();
        System.out.println(all);
    }
}
