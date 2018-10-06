package com.scnu.swaggerdemo.dao;

import com.scnu.swaggerdemo.domain.User;

import java.util.List;

public interface UserDao {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User findUserById(Integer id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAllUsers();

    /**
     * 插入用户信息
     * @param user
     */
    int saveUser(User user);

    /**
     * 根据用户Id删除用户
     * @param id
     */
    int deleteUserById(Integer id);
}
