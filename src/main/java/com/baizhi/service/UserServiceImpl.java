package com.baizhi.service;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> queryAll() {
        return userMapper.selectAll();
    }
}
