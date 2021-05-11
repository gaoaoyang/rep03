package com.itheima.hellospringboot.service.impl;

import com.itheima.hellospringboot.dao.UserDao;
import com.itheima.hellospringboot.domain.User;
import com.itheima.hellospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
