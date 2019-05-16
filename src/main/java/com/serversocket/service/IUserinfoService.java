package com.serversocket.service;

import com.serversocket.entity.Userinfo;
import com.serversocket.util.JsonResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @InterfaceName IUserinfoService
 * @Description
 * @Author wcx
 * @Date 2019/04/30 17:03
 * @Version
 **/
public interface IUserinfoService {

    /**
     * 添加用户
     *
     * @param userinfo
     * @return
     */
    JsonResponse register(Userinfo userinfo);

    /**
     * 根据id删除用户
     *
     * @param userId
     * @return
     */
    boolean deleteUserinfo(Long userId);

    /**
     * 更新用户信息
     *
     * @param userinfo
     * @return
     */
    boolean updateUserinfo(Userinfo userinfo);

    /**
     * 根据id查询用户
     *
     * @param userId
     * @return
     */
    Userinfo selectUserinfoById(Long userId);

    /**
     * 获取所有用户集合
     *
     * @return
     */
    List<Userinfo> selectAllUserinfo();

    /**
     * 登录验证
     *
     * @param userinfo
     * @return
     */
    JsonResponse checkLogin(Userinfo userinfo, HttpServletRequest request);

    /**
     * 根据账号搜索用户
     *
     * @param account
     * @return
     */
    JsonResponse serachUserinfoByAccount(Long account);

}
