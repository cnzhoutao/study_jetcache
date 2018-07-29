package com.zt.study_jetcache.service;

import com.alicp.jetcache.anno.CacheRefresh;
import com.alicp.jetcache.anno.CacheUpdate;
import com.alicp.jetcache.anno.Cached;
import com.zt.study_jetcache.domain.UserDomain;

import java.util.List;

public interface UserService {


    @CacheUpdate(name = "list", value ="#userDomain" )
    public void insertUser(UserDomain userDomain);

    @CacheUpdate(name = "list", value ="#userDomain" )
    public void updateUser(UserDomain userDomain);

    @Cached(expire = 3600)
    public List<UserDomain> queryAllUser();

}
