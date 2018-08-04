package com.zt.study_jetcache.service;

import com.alicp.jetcache.anno.CacheRefresh;
import com.alicp.jetcache.anno.CacheUpdate;
import com.alicp.jetcache.anno.Cached;
import com.alicp.jetcache.anno.CreateCache;
import com.zt.study_jetcache.domain.UserDomain;

import java.util.List;

public interface UserService {


    @CacheUpdate(name = "list", key = "1", value ="#userDomain" )
    public void insertUser(UserDomain userDomain);


    @CacheUpdate(name = "list",key = "1",value ="#userDomain" )
    public void updateUser(UserDomain userDomain);

    @Cached(name = "list",key = "1",expire = 3600)
    public List<UserDomain> queryAllUser();

}
