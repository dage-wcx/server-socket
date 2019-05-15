package com.serversocket.controller;

import com.serversocket.entity.Userinfo;
import com.serversocket.service.IUserinfoService;
import com.serversocket.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserinfoController
 * @Description
 * @Author wcx
 * @Date 2019/04/30 17:05
 * @Version
 **/
@RestController
@RequestMapping("/userinfo/")
public class UserinfoController {

    @Autowired
    private IUserinfoService userinfoServiceImpl;

    @PostMapping("registerUser")
    public String registerUser(Userinfo userinfo){
        boolean flag = userinfoServiceImpl.insertUserinfo(userinfo);
        if(!flag){
            return "error";
        }
        return "login";
    }

    @PostMapping("loginUser")
    public JsonResponse loginUser(Userinfo userinfo){
        System.out.println(userinfo);
        return userinfoServiceImpl.checkLogin(userinfo);
    }
}
