package com.serversocket.controller;

import com.serversocket.entity.Friends;
import com.serversocket.service.IFriendsService;
import com.serversocket.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FriendsController
 * @Description
 * @Author wcx
 * @Date 2019/05/16 15:09
 * @Version
 **/
@RestController
@RequestMapping("/friends/")
public class FriendsController {

    @Autowired
    private IFriendsService friendsService;

    /**
     * 添加好友等待验证
     *
     * @param friends
     * @return
     */
    @PostMapping("addFriendByUserAccount")
    public JsonResponse addFriend(Friends friends) {
        return friendsService.addFriend(friends);
    }

    /**
     * 获取等待验证信息
     *
     * @param account
     * @return
     */
    @PostMapping("getAddFriendsMsg")
    public JsonResponse getAddFriendsMsg(Long account) {
        return friendsService.getAddFriendsMsg(account);
    }

    /**
     * 展示用户好友
     *
     * @return
     */
    @PostMapping("showFriends")
    public JsonResponse showFriends(Long account) {
        return friendsService.showFriends(account);
    }

    /**
     * 同意或拒绝添加好友
     *
     * @param friends
     * @return
     */
    @PostMapping("agreeOrRefuseAddFriend")
    public JsonResponse agreeOrRefuseAddFriend(Friends friends) {
        System.out.println(friends);
        return friendsService.agreeOrRefuseAddFriend(friends);
    }

}
