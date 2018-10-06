package com.scnu.swaggerdemo.service.impl;

import com.scnu.swaggerdemo.dao.UserDao;
import com.scnu.swaggerdemo.domain.User;
import com.scnu.swaggerdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
/*    @Autowired
    @Qualifier("userDao")*/
    @Resource
    private UserDao userDao;

    @Override
    public User selectOneUser(Integer id) {
        return userDao.findUserById(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    public int addUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public int deletUser(Integer id) {
        return userDao.deleteUserById(id);
    }
}
