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

    int checkLogin(Userinfo userinfo);
}
