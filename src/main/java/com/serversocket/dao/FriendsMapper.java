package com.serversocket.dao;

import com.serversocket.entity.Friends;
import com.serversocket.entity.Userinfo;

import java.util.List;

public interface FriendsMapper {
    /**
     * @mbggenerated 2019-05-16
     */
    int deleteByPrimaryKey(Long fId);

    /**
     * @mbggenerated 2019-05-16
     */
    int insert(Friends record);

    /**
     * @mbggenerated 2019-05-16
     */
    int insertSelective(Friends record);

    /**
     * @mbggenerated 2019-05-16
     */
    Friends selectByPrimaryKey(Long fId);

    /**
     * @mbggenerated 2019-05-16
     */
    int updateByPrimaryKeySelective(Friends record);

    /**
     * @mbggenerated 2019-05-16
     */
    int updateByPrimaryKey(Friends record);

    /**
     * 根据用户账号获取用户的所有好友
     *
     * @param userAccount
     * @return
     */
    List<Userinfo> showFriendsByUserinfoAccount(Long userAccount);

    List<Friends> selectByFriendAccount(Long account);

    /**
     * 修改通知状态
     *
     * @param friends
     * @return
     */
    int updateStateNotifyByUaccountAndFaccount(Friends friends);
}