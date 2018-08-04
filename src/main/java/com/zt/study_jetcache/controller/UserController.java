package com.zt.study_jetcache.controller;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CreateCache;
import com.zt.study_jetcache.domain.UserDomain;
import com.zt.study_jetcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class UserController {

    @Autowired
    private UserService userService;


    @CreateCache(expire = 100)
    private Cache<Long, Long> userCache;



    @RequestMapping(value = "index1")
    public String indexHtml(HttpServletRequest request){
        System.err.println("进入首页请求");
        return "index";
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public void insertUser(UserDomain userDomain) {
        userService.insertUser(userDomain);
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public void updateUser(UserDomain userDomain) {
        userService.updateUser(userDomain);
    }

    @RequestMapping(value = "query")
    @ResponseBody
    public List<UserDomain> queryAll() {
        return userService.queryAllUser();
    }

    @RequestMapping(value = "/put")
    @ResponseBody
    public Long testCachePut(long key,long val){
        userCache.put(key,val);
        return val;
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public Long testCacheget(long key){
     return userCache.get(key);
    }




}
