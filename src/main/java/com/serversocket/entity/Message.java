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
}
