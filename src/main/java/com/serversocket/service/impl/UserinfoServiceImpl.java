package com.serversocket.service.impl;

import com.serversocket.client.Client;
import com.serversocket.dao.UserinfoMapper;
import com.serversocket.entity.Userinfo;
import com.serversocket.service.IUserinfoService;
import com.serversocket.util.AccountUtils;
import com.serversocket.util.JsonResponse;
import com.serversocket.util.WebContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @ClassName UserinfoServiceImpl
 * @Description
 * @Author wcx
 * @Date 2019/04/30 17:16
 * @Version
 **/
@Service
public class UserinfoServiceImpl implements IUserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;

    /**
     * 添加用户
     * @param userinfo
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insertUserinfo(Userinfo userinfo) {
        try{
            userinfo.setUserAccount(AccountUtils.getAccount());
            userinfo.setRegisterTime(new Date());
            userinfo.setTag(1);
            int i = userinfoMapper.insertUserinfo(userinfo);
            if(i > 0){
                return true;
            }
        } catch (Exception e){
            e.printStackTrace();
            //打印日志  未处理
        }
        return false;
    }

    /**
     * 根据id删除用户
     * @param userId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean deleteUserinfo(Long userId) {
        try{
            int i = userinfoMapper.deleteUserinfo(userId);
            if(i > 0){
                return true;
            }
        } catch (Exception e){
            e.printStackTrace();
            //打印日志 未处理
        }
        return false;
    }

    /**
     * 更新用户信息
     * @param userinfo
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateUserinfo(Userinfo userinfo) {
        try{
            int i = userinfoMapper.updateUserinfo(userinfo);
            if(i > 0){
                return true;
            }
        } catch (Exception e){
            e.printStackTrace();
            //打印日志 未处理
        }
        return false;
    }

    /**
     * 根据id查询用户
     * @param userId
     * @return
     */
    @Override
    public Userinfo selectUserinfoById(Long userId) {
        try{
            Userinfo userinfo = userinfoMapper.selectUserinfoById(userId);
            if(userinfo != null){
                return userinfo;
            }
        } catch (Exception e){
            e.printStackTrace();
            //打印日志 未处理
        }
        return null;
    }

    /**
     * 获取所有用户集合
     * @return
     */
    @Override
    public List<Userinfo> selectAllUserinfo() {
        try{
            List<Userinfo> list = userinfoMapper.selectAllUserinfo();
            if(list != null){
                return list;
            }
        } catch (Exception e){
            e.printStackTrace();
            //打印日志 未处理
        }
        return null;
    }

    /**
     * 登录验证
     * @param userinfo
     * @return
     */
    @Override
    public JsonResponse checkLogin(Userinfo userinfo) {
        try{
            Userinfo u = userinfoMapper.checkLogin(userinfo);
            if(u != null){
                //new Client(u.getUserAccount()).scoketStart();
                return new JsonResponse(WebContext.COMMON_R_OK, WebContext.COMMENT_SUCCESS_MSG, WebContext.COMMENT_TRUE);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return new JsonResponse(WebContext.COMMON_R_FAIL, WebContext.USERNAME_OR_PASSWORD_ERROR, WebContext.COMMENT_FALSE);
    }
}
