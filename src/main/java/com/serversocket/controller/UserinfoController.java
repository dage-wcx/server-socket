package com.serversocket.controller;

import com.serversocket.client.Client;
import com.serversocket.entity.Message;
import com.serversocket.entity.Userinfo;
import com.serversocket.service.IUserinfoService;
import com.serversocket.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

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

    @Autowired
    private Client client;

    /**
     * 注册
     *
     * @param userinfo
     * @return
     */
    @PostMapping("register")
    public JsonResponse register(Userinfo userinfo) {
        return userinfoServiceImpl.register(userinfo);
    }

    /**
     * 登录
     *
     * @param userinfo
     * @return
     */
    @PostMapping("login")
    public JsonResponse login(Userinfo userinfo, HttpServletRequest request) {
        return userinfoServiceImpl.checkLogin(userinfo, request);
    }

    /**
     * 根据账号搜索用户
     *
     * @param account
     * @return
     */
    @PostMapping("serachUserinfoByAccount")
    public JsonResponse serachUserinfoByAccount(Long account) {
        return userinfoServiceImpl.serachUserinfoByAccount(account);
    }

    @PostMapping("/chat")
    public JsonResponse chat(Message message) throws IOException {
        client.getSocket(1192274716L);
        return null;
    }

}
