package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 通知公告：(NotificationAnnouncement)表实体类
 *
 */
@TableName("`notification_announcement`")
@Data
@EqualsAndHashCode(callSuper = false)
public class NotificationAnnouncement implements Serializable {

    // NotificationAnnouncement编号
    @TableId(value = "notification_announcement_id", type = IdType.AUTO)
    private Integer notification_announcement_id;

    // 发布人
    @TableField(value = "`publisher`")
    private String publisher;
    // 公告标题
    @TableField(value = "`announcement_title`")
    private String announcement_title;
    // 发布时间
    @TableField(value = "`release_time`")
    private Timestamp release_time;
    // 公告类型
    @TableField(value = "`announcement_type`")
    private String announcement_type;

    // 点击数
    @TableField(value = "hits")
    private Integer hits;

    // 点赞数
    @TableField(value = "praise_len")
    private Integer praise_len;








    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
