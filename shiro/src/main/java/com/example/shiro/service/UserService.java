package com.example.shiro.service;

import com.example.shiro.model.User;

public interface UserService {

    User findByUsername(String username);
}
