package com.serversocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName WebController
 * @Description
 * @Author wcx
 * @Date 2019/05/15 14:45
 * @Version
 **/
@Controller
public class WebController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/addfriend")
    public String addFriend(){
        return "addfriend";
    }

    @RequestMapping("/showfriend")
    public String showFriends(){
        return "showfriend";
    }

    @RequestMapping("/addFriendVer")
    public String addFriendVer(){return "addFriendVer";}

    @RequestMapping("/chat")
    public String chat(){return "chat";}
}
