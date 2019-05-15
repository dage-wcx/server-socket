package com.serversocket.controller;

import com.serversocket.entity.Userinfo;
import com.serversocket.service.IUserinfoService;
import com.serversocket.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("register")
    public JsonResponse register(Userinfo userinfo) {
        return userinfoServiceImpl.register(userinfo);
    }

    @PostMapping("login")
    public JsonResponse login(Userinfo userinfo) {
        System.out.println(userinfo);
        return userinfoServiceImpl.checkLogin(userinfo);
    }
}
