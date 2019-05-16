package com.serversocket.service;

import com.serversocket.entity.Friends;
import com.serversocket.util.JsonResponse;

/**
 * @InterfaceName IFriendsService
 * @Description
 * @Author wcx
 * @Date 2019/05/16 15:07
 * @Version
 **/
public interface IFriendsService {

    /**
     * 添加好友需等待验证
     *
     * @param friends
     * @return
     */
    JsonResponse addFriend(Friends friends);

    /**
     * 获取添加好友等待验证信息
     *
     * @param account
     * @return
     */
    JsonResponse getAddFriendsMsg(Long account);

    /**
     * 显示用户好友
     *
     * @param userAccount
     * @return
     */
    JsonResponse showFriends(Long userAccount);

    /**
     * 同意或拒绝添加好友
     *
     * @param friends
     * @return
     */
    JsonResponse agreeOrRefuseAddFriend(Friends friends);
}
