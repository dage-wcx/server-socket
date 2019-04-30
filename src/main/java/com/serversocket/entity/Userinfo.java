package com.serversocket.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Userinfo 用户类
 * @Description
 * @Author wcx
 * @Date 2019/04/30 15:58
 * @Version
 **/
public class Userinfo implements Serializable {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户账号
     */
    private Long userAccount;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户头像
     */
    private String headPhoto;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 用户生日
     */
    private Date birthday;

    /**
     * 用户注册时间
     */
    private Date registerTime;

    /**
     * 用户修改时间
     */
    private Date modifyTime;

    /**
     * 用户标记  0-无效  1-有效
     */
    private Integer tag;
}
