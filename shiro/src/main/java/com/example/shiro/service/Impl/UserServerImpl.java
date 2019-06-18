package com.example.shiro.service.Impl;

import com.example.shiro.mapper.UserMapper;
import com.example.shiro.model.User;
import com.example.shiro.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServerImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
