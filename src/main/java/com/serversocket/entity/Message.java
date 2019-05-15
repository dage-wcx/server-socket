package com.serversocket.entity;

import java.util.Date;

public class Message {
    /**
     * 信息id
     */
    private Long msgId;

    /**
     * 发送信息的用户账号
     */
    private Long sendMsgUserAccount;

    /**
     * 发送信息的用户名
     */
    private String sendMsgUserName;

    /**
     * 发送信息的用户端口
     */
    private Integer sendMsgUserPort;

    /**
     * 发送信息的用户ip
     */
    private Long sendMsgUserIp;

    /**
     * 接收信息的用户账号
     */
    private Long receiveMsgUserAccount;

    /**
     * 发送消息时间
     */
    private Date sendMsgTime;

    /**
     * 消息内容
     */
    private String sendMsgContent;

    /**
     *
     * @mbggenerated 2019-05-15
     */
    public Message(Long msgId, Long sendMsgUserAccount, String sendMsgUserName, Integer sendMsgUserPort, Long sendMsgUserIp, Long receiveMsgUserAccount, Date sendMsgTime, String sendMsgContent) {
        this.msgId = msgId;
        this.sendMsgUserAccount = sendMsgUserAccount;
        this.sendMsgUserName = sendMsgUserName;
        this.sendMsgUserPort = sendMsgUserPort;
        this.sendMsgUserIp = sendMsgUserIp;
        this.receiveMsgUserAccount = receiveMsgUserAccount;
        this.sendMsgTime = sendMsgTime;
        this.sendMsgContent = sendMsgContent;
    }

    /**
     *
     * @mbggenerated 2019-05-15
     */
    public Message() {
        super();
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Long getMsgId() {
        return msgId;
    }

    /**
     * 设置
     * 
     * @param msgId
     */
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Long getSendMsgUserAccount() {
        return sendMsgUserAccount;
    }

    /**
     * 设置
     * 
     * @param sendMsgUserAccount
     */
    public void setSendMsgUserAccount(Long sendMsgUserAccount) {
        this.sendMsgUserAccount = sendMsgUserAccount;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getSendMsgUserName() {
        return sendMsgUserName;
    }

    /**
     * 设置
     * 
     * @param sendMsgUserName
     */
    public void setSendMsgUserName(String sendMsgUserName) {
        this.sendMsgUserName = sendMsgUserName == null ? null : sendMsgUserName.trim();
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getSendMsgUserPort() {
        return sendMsgUserPort;
    }

    /**
     * 设置
     * 
     * @param sendMsgUserPort
     */
    public void setSendMsgUserPort(Integer sendMsgUserPort) {
        this.sendMsgUserPort = sendMsgUserPort;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Long getSendMsgUserIp() {
        return sendMsgUserIp;
    }

    /**
     * 设置
     * 
     * @param sendMsgUserIp
     */
    public void setSendMsgUserIp(Long sendMsgUserIp) {
        this.sendMsgUserIp = sendMsgUserIp;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Long getReceiveMsgUserAccount() {
        return receiveMsgUserAccount;
    }

    /**
     * 设置
     * 
     * @param receiveMsgUserAccount
     */
    public void setReceiveMsgUserAccount(Long receiveMsgUserAccount) {
        this.receiveMsgUserAccount = receiveMsgUserAccount;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Date getSendMsgTime() {
        return sendMsgTime;
    }

    /**
     * 设置
     * 
     * @param sendMsgTime
     */
    public void setSendMsgTime(Date sendMsgTime) {
        this.sendMsgTime = sendMsgTime;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getSendMsgContent() {
        return sendMsgContent;
    }

    /**
     * 设置
     * 
     * @param sendMsgContent
     */
    public void setSendMsgContent(String sendMsgContent) {
        this.sendMsgContent = sendMsgContent == null ? null : sendMsgContent.trim();
    }
}