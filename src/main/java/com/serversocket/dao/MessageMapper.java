package com.serversocket.dao;

import com.serversocket.entity.Message;

public interface MessageMapper {
    /**
     *
     * @mbggenerated 2019-05-15
     */
    int deleteByPrimaryKey(Long msgid);

    /**
     *
     * @mbggenerated 2019-05-15
     */
    int insert(Message record);

    /**
     *
     * @mbggenerated 2019-05-15
     */
    int insertSelective(Message record);

    /**
     *
     * @mbggenerated 2019-05-15
     */
    Message selectByPrimaryKey(Long msgid);

    /**
     *
     * @mbggenerated 2019-05-15
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     *
     * @mbggenerated 2019-05-15
     */
    int updateByPrimaryKey(Message record);
}