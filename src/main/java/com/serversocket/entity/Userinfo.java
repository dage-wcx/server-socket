package com.serversocket.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFilter;

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
     * 手机号
     */
    private Long phone;

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
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    /**
     * 用户注册时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date registerTime;

    /**
     * 用户修改时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;

    /**
     * 用户标记  0-无效  1-有效
     */
    private Integer tag;

    public Userinfo() { }

    public Userinfo(Long userId, Long userAccount, String username, String password, Long phone,
                    String headPhoto, String sex, Date birthday, Date registerTime, Date modifyTime, Integer tag) {
        this.userId = userId;
        this.userAccount = userAccount;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.headPhoto = headPhoto;
        this.sex = sex;
        this.birthday = birthday;
        this.registerTime = registerTime;
        this.modifyTime = modifyTime;
        this.tag = tag;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(Long userAccount) {
        this.userAccount = userAccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "userId=" + userId +
                ", userAccount=" + userAccount +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", headPhoto='" + headPhoto + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", registerTime=" + registerTime +
                ", modifyTime=" + modifyTime +
                ", tag=" + tag +
                '}';
    }
}
