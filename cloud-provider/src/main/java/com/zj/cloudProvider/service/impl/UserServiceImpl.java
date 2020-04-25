package com.zj.cloudProvider.service.impl;

import com.zj.api.entity.User;
import com.zj.cloudProvider.dao.UserDao;
import com.zj.cloudProvider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(Long id) {
        return new User(1L,"zhangsan",18);
    }
}
