package com.serversocket.entity;

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
     *
     * @mbggenerated 2019-05-16
     */
    public Friends(Long fId, Long userAccount, Long friendAccount) {
        this.fId = fId;
        this.userAccount = userAccount;
        this.friendAccount = friendAccount;
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
}