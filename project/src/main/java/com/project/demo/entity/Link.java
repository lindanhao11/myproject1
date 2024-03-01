package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 友情链接：(Link)表实体类
 *
 * @author xxx
 *@since 202X-XX-XX
 */
@TableName("link")
@Data
@EqualsAndHashCode(callSuper = false)
public class Link implements Serializable {

    private static final long serialVersionUID = 141939183577887356L;

    /**
     * 友情链接ID：[0,32767]
     */
    @TableId(value = "link_id", type = IdType.AUTO)
    private Integer linkId;

    /**
     * 显示顺序：[0,10000]数值越小，越优先显示
     */
    @TableField(value = "display")
    private Integer display;

    /**
     * 链接名称：[0,32]
     */
    @TableField(value = "name")
    private String name;

    /**
     * 友情链接图：[0,255]
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

