package com.scnu.swaggerdemo.service;

import com.scnu.swaggerdemo.domain.User;

import java.util.List;

public interface UserService {
    User selectOneUser(Integer id);
    List<User> selectAllUsers();
    int addUser(User user);
    int deletUser(Integer id);
}
