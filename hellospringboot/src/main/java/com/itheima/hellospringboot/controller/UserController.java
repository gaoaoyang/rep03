package com.itheima.hellospringboot.controller;

import com.itheima.hellospringboot.domain.User;
import com.itheima.hellospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;
    @RequestMapping("/user")
    public List<User> userTest(){
        return userService.findAll();
    }
}
