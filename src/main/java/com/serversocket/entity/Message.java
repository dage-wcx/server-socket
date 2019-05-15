package com.serversocket.entity;

import java.util.Date;

public class Message {
    /**
     * 信息id
     */
    private Long msgId;

    /**
     * 发送信息的用户id
     */
    private Long sendMsgUserId;

    /**
     * 发送信息的用户名
     */
    private String sendMsgUserName;

    /**
     * 发送信息的用户端口号
     */
    private Integer sendMsgUserPort;

    /**
     * 发送信息的用户ip
     */
    private Long sendMsgUserIp;

    /**
     * 接受信息的用户id
     */
    private Long receiveMsgUserId;

    /**
     * 发送信息时间
     */
    private Date sendMsgTime;

    /**
     *
     * @mbggenerated 2019-05-15
     */
    public Message(Long msgId, Long sendMsgUserId, String sendMsgUserName, Integer sendMsgUserPort, Long sendMsgUserIp, Long receiveMsgUserId, Date sendMsgTime) {
        this.msgId = msgId;
        this.sendMsgUserId = sendMsgUserId;
        this.sendMsgUserName = sendMsgUserName;
        this.sendMsgUserPort = sendMsgUserPort;
        this.sendMsgUserIp = sendMsgUserIp;
        this.receiveMsgUserId = receiveMsgUserId;
        this.sendMsgTime = sendMsgTime;
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
    public Long getSendMsgUserId() {
        return sendMsgUserId;
    }

    /**
     * 设置
     * 
     * @param sendMsgUserId
     */
    public void setSendMsgUserId(Long sendMsgUserId) {
        this.sendMsgUserId = sendMsgUserId;
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
    public Long getReceiveMsgUserId() {
        return receiveMsgUserId;
    }

    /**
     * 设置
     * 
     * @param receiveMsgUserId
     */
    public void setReceiveMsgUserId(Long receiveMsgUserId) {
        this.receiveMsgUserId = receiveMsgUserId;
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
}