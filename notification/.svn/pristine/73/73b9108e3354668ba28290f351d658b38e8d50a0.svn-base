package com.yonyou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import com.yonyou.pojo.Notification;
import com.yonyou.pojo.NotificationExample;

public interface NotificationMapper {
    @Insert({
        "insert into notification (SYSTEMID, COMMUNICATION_TYPE, ",
        "URL, MESSAGE, NOTICE_TYPE, ",
        "LAST_SEND_TIME, NOTICE_STATUS, ",
        "SEND_COUNT)",
        "values (#{systemid,jdbcType=VARCHAR}, #{communicationType,jdbcType=INTEGER}, ",
        "#{url,jdbcType=VARCHAR}, #{message,jdbcType=VARCHAR}, #{noticeType,jdbcType=INTEGER}, ",
        "#{lastSendTime,jdbcType=VARCHAR}, #{noticeStatus,jdbcType=INTEGER}, ",
        "#{sendCount,jdbcType=INTEGER})"
    })
    int insert(Notification record);

    @InsertProvider(type=NotificationSqlProvider.class, method="insertSelective")
    int insertSelective(Notification record);

    @SelectProvider(type=NotificationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SYSTEMID", property="systemid", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMUNICATION_TYPE", property="communicationType", jdbcType=JdbcType.INTEGER),
        @Result(column="URL", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="MESSAGE", property="message", jdbcType=JdbcType.VARCHAR),
        @Result(column="NOTICE_TYPE", property="noticeType", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_SEND_TIME", property="lastSendTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="NOTICE_STATUS", property="noticeStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="SEND_COUNT", property="sendCount", jdbcType=JdbcType.INTEGER)
    })
    List<Notification> selectByExample(NotificationExample example);
}