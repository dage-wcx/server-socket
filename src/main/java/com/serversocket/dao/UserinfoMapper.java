package com.serversocket.dao;

import com.serversocket.entity.Userinfo;

import java.util.List;

/**
 * @InterfaceName UserinfoMapper
 * @Description
 * @Author wcx
 * @Date 2019/04/30 17:03
 * @Version
 **/
public interface UserinfoMapper {

    int insertUserinfo(Userinfo userinfo);

    int deleteUserinfo(Long userId);

    int updateUserinfo(Userinfo userinfo);

    Userinfo selectUserinfoById(Long userId);

    List<Userinfo> selectAllUserinfo();

    Userinfo checkLogin(Userinfo userinfo);

    Userinfo selectUserinfoByAccount(Long account);

    /**
     * 根据用户账号获取用户的所有好友
     *
     * @param userAccount
     * @return
     */
    List<Userinfo> showFriendsByUserinfoAccount(Long userAccount);
}
