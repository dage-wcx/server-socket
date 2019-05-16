package com.serversocket.entity;

import java.util.Date;

public class Friends {
    /**
     * 
     */
    private Long fId;

    /**
     * 用户账号
     */
    private Long userAccount;

    /**
     * 好友账号
     */
    private Long friendAccount;

    /**
     * 状态通知
     */
    private Integer stateNotify;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     *
     * @mbggenerated 2019-05-16
     */
    public Friends(Long fId, Long userAccount, Long friendAccount, Integer stateNotify, Date createTime) {
        this.fId = fId;
        this.userAccount = userAccount;
        this.friendAccount = friendAccount;
        this.stateNotify = stateNotify;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2019-05-16
     */
    public Friends() {
        super();
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Long getfId() {
        return fId;
    }

    /**
     * 设置
     * 
     * @param fId 
     */
    public void setfId(Long fId) {
        this.fId = fId;
    }

    /**
     * 获取用户账号
     * 
     * @return 
     */
    public Long getUserAccount() {
        return userAccount;
    }

    /**
     * 设置用户账号
     * 
     * @param userAccount 用户账号
     */
    public void setUserAccount(Long userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取好友账号
     * 
     * @return 
     */
    public Long getFriendAccount() {
        return friendAccount;
    }

    /**
     * 设置好友账号
     * 
     * @param friendAccount 好友账号
     */
    public void setFriendAccount(Long friendAccount) {
        this.friendAccount = friendAccount;
    }

    /**
     * 获取状态通知
     * 
     * @return 
     */
    public Integer getStateNotify() {
        return stateNotify;
    }

    /**
     * 设置状态通知
     * 
     * @param stateNotify 状态通知
     */
    public void setStateNotify(Integer stateNotify) {
        this.stateNotify = stateNotify;
    }

    /**
     * 获取创建时间
     * 
     * @return 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     * 
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "fId=" + fId +
                ", userAccount=" + userAccount +
                ", friendAccount=" + friendAccount +
                ", stateNotify=" + stateNotify +
                ", createTime=" + createTime +
                '}';
    }
}