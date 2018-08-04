package com.zt.study_jetcache.service.impl;

import com.zt.study_jetcache.dao.UserDao;
import com.zt.study_jetcache.domain.UserDomain;
import com.zt.study_jetcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void insertUser(UserDomain userDomain) {
        userDao.insertUser(userDomain);
    }

    @Override
    public void updateUser(UserDomain userDomain) {
        userDao.updateUser(userDomain);
    }

    @Override
    public List<UserDomain> queryAllUser() {
        System.err.println("从db中获取数据");
        return userDao.queryAllUser();
    }
}
