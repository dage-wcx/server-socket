package com.serversocket.controller;

import com.serversocket.entity.Userinfo;
import com.serversocket.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserinfoController
 * @Description
 * @Author wcx
 * @Date 2019/04/30 17:05
 * @Version
 **/
@Controller
@RequestMapping("/userinfo/")
public class UserinfoController {

    @Autowired
    private IUserinfoService userinfoServiceImpl;

    @RequestMapping("register")
    public String register(){
        return "register";
    }

    @PostMapping("registerUser")
    public String registerUser(Userinfo userinfo){
        boolean flag = userinfoServiceImpl.insertUserinfo(userinfo);
        if(!flag){
            return "error";
        }
        return "login";
    }
}
