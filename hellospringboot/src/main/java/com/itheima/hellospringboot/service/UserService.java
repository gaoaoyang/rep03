package com.itheima.hellospringboot.service;

import com.itheima.hellospringboot.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
