package com.serversocket.entity;

import java.util.Date;

public class Message {
    /**
     * 
     */
    private Long msgid;

    /**
     * 
     */
    private Long sendmsguserid;

    /**
     * 
     */
    private String sendmsgusername;

    /**
     * 
     */
    private Integer sendmsguserport;

    /**
     * 
     */
    private Long sendmsguserip;

    /**
     * 
     */
    private Long receivemsguserid;

    /**
     * 
     */
    private Date sendmsgtime;

    /**
     *
     * @mbggenerated 2019-05-15
     */
    public Message(Long msgid, Long sendmsguserid, String sendmsgusername, Integer sendmsguserport, Long sendmsguserip, Long receivemsguserid, Date sendmsgtime) {
        this.msgid = msgid;
        this.sendmsguserid = sendmsguserid;
        this.sendmsgusername = sendmsgusername;
        this.sendmsguserport = sendmsguserport;
        this.sendmsguserip = sendmsguserip;
        this.receivemsguserid = receivemsguserid;
        this.sendmsgtime = sendmsgtime;
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
    public Long getMsgid() {
        return msgid;
    }

    /**
     * 设置
     * 
     * @param msgid 
     */
    public void setMsgid(Long msgid) {
        this.msgid = msgid;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Long getSendmsguserid() {
        return sendmsguserid;
    }

    /**
     * 设置
     * 
     * @param sendmsguserid 
     */
    public void setSendmsguserid(Long sendmsguserid) {
        this.sendmsguserid = sendmsguserid;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public String getSendmsgusername() {
        return sendmsgusername;
    }

    /**
     * 设置
     * 
     * @param sendmsgusername 
     */
    public void setSendmsgusername(String sendmsgusername) {
        this.sendmsgusername = sendmsgusername == null ? null : sendmsgusername.trim();
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Integer getSendmsguserport() {
        return sendmsguserport;
    }

    /**
     * 设置
     * 
     * @param sendmsguserport 
     */
    public void setSendmsguserport(Integer sendmsguserport) {
        this.sendmsguserport = sendmsguserport;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Long getSendmsguserip() {
        return sendmsguserip;
    }

    /**
     * 设置
     * 
     * @param sendmsguserip 
     */
    public void setSendmsguserip(Long sendmsguserip) {
        this.sendmsguserip = sendmsguserip;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Long getReceivemsguserid() {
        return receivemsguserid;
    }

    /**
     * 设置
     * 
     * @param receivemsguserid 
     */
    public void setReceivemsguserid(Long receivemsguserid) {
        this.receivemsguserid = receivemsguserid;
    }

    /**
     * 获取
     * 
     * @return 
     */
    public Date getSendmsgtime() {
        return sendmsgtime;
    }

    /**
     * 设置
     * 
     * @param sendmsgtime 
     */
    public void setSendmsgtime(Date sendmsgtime) {
        this.sendmsgtime = sendmsgtime;
    }
}