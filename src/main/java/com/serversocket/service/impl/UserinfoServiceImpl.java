package com.serversocket.service.impl;

import com.serversocket.dao.UserinfoMapper;
import com.serversocket.entity.Userinfo;
import com.serversocket.service.IUserinfoService;
import com.serversocket.util.AccountUtils;
import com.serversocket.util.JsonResponse;
import com.serversocket.util.WebContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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

    @Resource
    private UserinfoMapper userinfoMapper;

    /**
     * 用户注册
     *
     * @param userinfo
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public JsonResponse register(Userinfo userinfo) {
        try {
            //1.生成用户账号，注册时间，账号设为有效
            userinfo.setUserAccount(AccountUtils.getAccount());
            userinfo.setRegisterTime(new Date());
            userinfo.setTag(1);

            //2.添加用户
            int i = userinfoMapper.insertUserinfo(userinfo);
            if (i > 0) {
                return new JsonResponse(WebContext.COMMON_R_OK, userinfo.getUserAccount().toString(), WebContext.COMMENT_TRUE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            //打印日志  未处理
        }
        return new JsonResponse(WebContext.COMMON_R_FAIL, WebContext.COMMENT_ERR_MSG, WebContext.COMMENT_FALSE);
    }

    /**
     * 根据id删除用户
     *
     * @param userId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean deleteUserinfo(Long userId) {
        try {
            int i = userinfoMapper.deleteUserinfo(userId);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            //打印日志 未处理
        }
        return false;
    }

    /**
     * 更新用户信息
     *
     * @param userinfo
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateUserinfo(Userinfo userinfo) {
        try {
            int i = userinfoMapper.updateUserinfo(userinfo);
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            //打印日志 未处理
        }
        return false;
    }

    /**
     * 根据id查询用户
     *
     * @param userId
     * @return
     */
    @Override
    public Userinfo selectUserinfoById(Long userId) {
        try {
            Userinfo userinfo = userinfoMapper.selectUserinfoById(userId);
            if (userinfo != null) {
                return userinfo;
            }
        } catch (Exception e) {
            e.printStackTrace();
            //打印日志 未处理
        }
        return null;
    }

    /**
     * 获取所有用户集合
     *
     * @return
     */
    @Override
    public List<Userinfo> selectAllUserinfo() {
        try {
            List<Userinfo> list = userinfoMapper.selectAllUserinfo();
            if (list != null) {
                return list;
            }
        } catch (Exception e) {
            e.printStackTrace();
            //打印日志 未处理
        }
        return null;
    }

    /**
     * 登录验证
     *
     * @param userinfo
     * @return
     */
    @Override
    public JsonResponse checkLogin(Userinfo userinfo) {
        try {
            Userinfo u = userinfoMapper.checkLogin(userinfo);
            if (u != null) {
                //new Client(u.getUserAccount()).scoketStart();
                return new JsonResponse(WebContext.COMMON_R_OK, WebContext.COMMENT_SUCCESS_MSG, WebContext.COMMENT_TRUE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JsonResponse(WebContext.COMMON_R_FAIL, WebContext.USERNAME_OR_PASSWORD_ERROR, WebContext.COMMENT_FALSE);
    }

}
