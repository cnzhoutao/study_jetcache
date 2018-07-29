package com.zt.study_jetcache.dao;

import com.zt.study_jetcache.domain.UserDomain;

import java.util.List;

public interface UserDao {

    public void insertUser(UserDomain userDomain);

    public void updateUser(UserDomain userDomain);

    public List<UserDomain> queryAllUser();

}
