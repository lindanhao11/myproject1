package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 广告信息：(Ad)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("ad")
@Data
@EqualsAndHashCode(callSuper = false)
public class Ad implements Serializable {

    private static final long serialVersionUID = -46394194410513029L;

    /**
     * 广告ID：[0,32767]
     */
    @TableId(value = "ad_id", type = IdType.AUTO)
    private Integer adId;

    /**
     * 显示顺序：[0,10000]数值越小，越优先显示
     */
    @TableField(value = "display")
    private Integer display;

    /**
     * 点击量：[0,2147483647]
     */
    @TableField(value = "hits")
    private Integer hits;

    /**
     * 投放位置：[0,16]
     */
    @TableField(value = "location")
    private String location;

    /**
     * 广告标题：[0,32]
     */
    @TableField(value = "title")
    private String title;

    /**
     * 广告内容：[0,255]
     */
    @TableField(value = "content")
    private String content;

    /**
     * 广告图：[0,255]
     */
    @TableField(value = "img")
    private String img;

    /**
     * 跳转链接：[0,255]
     */
    @TableField(value = "url")
    private String url;

    /**
     * 创建时间：
     */
    @TableField(value = "create_time")
    private Timestamp createTime;

    /**
     * 更新时间：
     */
    @TableField(value = "update_time")
    private Timestamp updateTime;

}

