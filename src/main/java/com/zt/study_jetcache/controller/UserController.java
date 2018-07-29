package com.zt.study_jetcache.controller;

import com.zt.study_jetcache.domain.UserDomain;
import com.zt.study_jetcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/")
public class UserController {

    @Autowired
    private UserService userService;

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


}
