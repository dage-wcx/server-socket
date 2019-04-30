package com.serversocket.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Message 消息类
 * @Description
 * @Author wcx
 * @Date 2019/04/30 15:59
 * @Version
 **/
public class Message implements Serializable {

    /**
     * 消息id
     */
    private Long msgId;

    /**
     * 发送消息的用户id
     */
    private Long sendMsgUserId;

    /**
     * 发送消息的用户名
     */
    private String sendMsgUsername;

    /**
     * 发送消息的用户端口
     */
    private Integer sendMsgUserPort;

    /**
     * 发送消息的用户端口
     */
    private Integer sendMsgUserIP;

    /**
     * 接收消息的用户id
     */
    private Long receiveMsgUserId;

    /**
     * 发送消息的时间
     */
    private Date sendMsgTime;

    public Message() { }

    public Message(Long msgId, Long sendMsgUserId, String sendMsgUsername, Integer sendMsgUserPort, Integer sendMsgUserIP,
                   Long receiveMsgUserId, Date sendMsgTime) {
        this.msgId = msgId;
        this.sendMsgUserId = sendMsgUserId;
        this.sendMsgUsername = sendMsgUsername;
        this.sendMsgUserPort = sendMsgUserPort;
        this.sendMsgUserIP = sendMsgUserIP;
        this.receiveMsgUserId = receiveMsgUserId;
        this.sendMsgTime = sendMsgTime;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public Long getSendMsgUserId() {
        return sendMsgUserId;
    }

    public void setSendMsgUserId(Long sendMsgUserId) {
        this.sendMsgUserId = sendMsgUserId;
    }

    public String getSendMsgUsername() {
        return sendMsgUsername;
    }

    public void setSendMsgUsername(String sendMsgUsername) {
        this.sendMsgUsername = sendMsgUsername;
    }

    public Integer getSendMsgUserPort() {
        return sendMsgUserPort;
    }

    public void setSendMsgUserPort(Integer sendMsgUserPort) {
        this.sendMsgUserPort = sendMsgUserPort;
    }

    public Integer getSendMsgUserIP() {
        return sendMsgUserIP;
    }

    public void setSendMsgUserIP(Integer sendMsgUserIP) {
        this.sendMsgUserIP = sendMsgUserIP;
    }

    public Long getReceiveMsgUserId() {
        return receiveMsgUserId;
    }

    public void setReceiveMsgUserId(Long receiveMsgUserId) {
        this.receiveMsgUserId = receiveMsgUserId;
    }

    public Date getSendMsgTime() {
        return sendMsgTime;
    }

    public void setSendMsgTime(Date sendMsgTime) {
        this.sendMsgTime = sendMsgTime;
    }
}
