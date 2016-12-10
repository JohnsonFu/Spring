package com.fulinhua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fulinhua on 2016/12/10.
 */
@Controller
public class LoginAction {

    @RequestMapping("login.do")
    public String login(String username,String password){
        if ("test".equals(username)) {
            System.out.println(username +" 登录成功");
            return "loginsuccess";//逻辑视图名       跳转页面默认为转发
           //System.out.println(username +" 登录成功");
        }
        return "loginError";
    }
}