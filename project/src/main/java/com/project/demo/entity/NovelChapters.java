package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 小说阅读
 */
@TableName("novel_chapters")
@Data
@EqualsAndHashCode(callSuper = false)
public class NovelChapters implements Serializable {

    private static final long serialVersionUID = -89845695959527153L;

    /**
     * 小说章节ID
     */
    @TableId(value = "novel_chapters_id", type = IdType.AUTO)
    private Integer novel_chapters_id;

    /**
     * 章节名称
     */
    @TableField(value = "chapter_name")
    private String chapter_name;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private String sort;

    /**
     * 章节内容
     */
    @TableField(value = "chapter_content")
    private String chapter_content;

    /**
     * 小说id
     */
    @TableField(value = "novel_reading_id")
    private Integer novel_reading_id;


    /**
     * 创建时间：
     */
    @TableField(value = "createTime")
    private Timestamp createTime;

    /**
     * 更新时间：
     */
    @TableField(value = "update_time")
    private Timestamp updateTime;

}

