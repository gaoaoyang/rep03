package com.itheima.hellospringboot.controller;

import com.itheima.hellospringboot.dao.UserDao;
import com.itheima.hellospringboot.domain.Person;
import com.itheima.hellospringboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Hellocontroller {

    @Autowired
    private Person person;


    @RequestMapping("/hello")
    public String helloTest(){
        System.out.println("hello");

        return "hello  springboot"+person;
    }

}
