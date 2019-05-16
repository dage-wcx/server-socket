package com.serversocket.service.impl;

import com.serversocket.dao.FriendsMapper;
import com.serversocket.entity.Friends;
import com.serversocket.entity.Userinfo;
import com.serversocket.service.IFriendsService;
import com.serversocket.util.JsonResponse;
import com.serversocket.util.WebContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @ClassName FriendsServiceImpl
 * @Description
 * @Author wcx
 * @Date 2019/05/16 15:08
 * @Version
 **/
@Service
public class FriendsServiceImpl implements IFriendsService {

    @Resource
    private FriendsMapper friendsMapper;

    /**
     * 添加好友需等待验证
     *
     * @param friends
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public JsonResponse addFriend(Friends friends) {
        try {
            //1.验证是否已经是好友


            //2.添加好友
            friends.setCreateTime(new Date());
            friends.setStateNotify(0);
            int i = friendsMapper.insert(friends);
            if (i > 0) {
                return new JsonResponse(WebContext.COMMON_R_OK, WebContext.WAIT_VER, WebContext.COMMENT_TRUE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JsonResponse(WebContext.COMMON_R_FAIL, WebContext.COMMENT_ERR_MSG, WebContext.COMMENT_FALSE);
    }

    /**
     * 获取添加好友,验证信息
     *
     * @param account
     * @return
     */
    @Override
    public JsonResponse getAddFriendsMsg(Long account) {
        try {
            List<Friends> friendsList = friendsMapper.selectByFriendAccount(account);
            System.out.println(friendsList);
            if(friendsList != null){
                return new JsonResponse(WebContext.COMMON_R_OK, WebContext.COMMENT_SUCCESS_MSG, friendsList);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JsonResponse(WebContext.COMMON_R_FAIL, WebContext.COMMENT_ERR_MSG, WebContext.COMMENT_FALSE);
    }

    /**
     * 展示用户好友
     *
     * @param userAccount
     * @return
     */
    @Override
    public JsonResponse showFriends(Long userAccount) {
        try {
            List<Userinfo> friendList = friendsMapper.showFriendsByUserinfoAccount(userAccount);
            if (friendList != null) {
                return new JsonResponse(WebContext.COMMON_R_OK, WebContext.COMMENT_SUCCESS_MSG, friendList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JsonResponse(WebContext.COMMON_R_FAIL, WebContext.COMMENT_ERR_MSG, WebContext.COMMENT_FALSE);
    }

    /**
     * 同意或拒绝添加好友
     * @param friends
     * @return
     */
    @Override
    public JsonResponse agreeOrRefuseAddFriend(Friends friends) {
        try{
            int i = friendsMapper.updateStateNotifyByUaccountAndFaccount(friends);
            if(i == 0){
                return new JsonResponse(WebContext.COMMON_R_FAIL, WebContext.COMMENT_ERR_MSG, WebContext.COMMENT_FALSE);
            }

            //同意,在加上一条数据
            if(friends.getStateNotify() != 1){
                return new JsonResponse(WebContext.COMMON_R_OK, "已拒绝", WebContext.COMMENT_TRUE);
            }
            friends.setCreateTime(new Date());
            int j = friendsMapper.insert(friends);
            if(j > 0){
                return new JsonResponse(WebContext.COMMON_R_OK, "已同意", WebContext.COMMENT_TRUE);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return new JsonResponse(WebContext.COMMON_R_FAIL, WebContext.COMMENT_ERR_MSG, WebContext.COMMENT_FALSE);
    }
}
