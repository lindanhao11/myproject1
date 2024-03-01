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
 * 课程分类：(CourseClassification)表实体类
 *
 */
@TableName("`course_classification`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseClassification implements Serializable {

    // CourseClassification编号
    @TableId(value = "course_classification_id", type = IdType.AUTO)
    private Integer course_classification_id;

    // 类型编号
    @TableField(value = "`type_number`")
    private String type_number;
    // 类型名称
    @TableField(value = "`type_name`")
    private String type_name;
    // 课程类型
    @TableField(value = "`course_type`")
    private String course_type;
    // 任课教师
    @TableField(value = "`teacher`")
    private Integer teacher;
    // 类型图片
    @TableField(value = "`type_image`")
    private String type_image;
    // 发布时间
    @TableField(value = "`release_time`")
    private Timestamp release_time;
    // 选课时间
    @TableField(value = "`course_selection_time`")
    private Timestamp course_selection_time;
    // 课程名额
    @TableField(value = "`course_quota`")
    private Integer course_quota;
    // 类型附件
    @TableField(value = "`type_attachment`")
    private String type_attachment;
    // 类型音频
    @TableField(value = "`type_audio`")
    private String type_audio;
    // 类型视频
    @TableField(value = "`type_video`")
    private String type_video;
    // 类型网址
    @TableField(value = "`type_url`")
    private String type_url;
    // 类型备注
    @TableField(value = "`type_remarks`")
    private String type_remarks;
    // 类型详情
    @TableField(value = "`type_details`")
    private String type_details;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
