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
 * 课程信息：(CourseInformation)表实体类
 *
 */
@TableName("`course_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseInformation implements Serializable {

    // CourseInformation编号
    @TableId(value = "course_information_id", type = IdType.AUTO)
    private Integer course_information_id;

    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 课程编号
    @TableField(value = "`course_id`")
    private String course_id;
    // 任课教师
    @TableField(value = "`teacher`")
    private Integer teacher;
    // 课程
    @TableField(value = "`curriculum`")
    private String curriculum;
    // 发布时间
    @TableField(value = "`release_time`")
    private Timestamp release_time;
    // 选课时间
    @TableField(value = "`course_selection_time`")
    private Timestamp course_selection_time;
    // 课程名额
    @TableField(value = "`course_quota`")
    private Integer course_quota;
    // 课程附件
    @TableField(value = "`course_attachments`")
    private String course_attachments;
    // 课程音频
    @TableField(value = "`course_audio`")
    private String course_audio;
    // 课程视频
    @TableField(value = "`course_video`")
    private String course_video;
    // 课程网址
    @TableField(value = "`course_website`")
    private String course_website;
    // 课程类型
    @TableField(value = "`course_type`")
    private String course_type;
    // 课程备注
    @TableField(value = "`course_notes`")
    private String course_notes;
    // 课程详情
    @TableField(value = "`course_details`")
    private String course_details;

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


	// 扫码状态
	@TableField(value = "qrcode_img")
	private String qrcode_img;

	// 二维码标题
	@TableField(value = "qrcode_title")
	private String qrcode_title;

	// 计时器标题
	@TableField(value = "timer_title")
	private String timer_title;

	// 计时开始时间
	@TableField(value = "timing_start_time")
	private Timestamp timing_start_time;

	// 计时结束时间
	@TableField(value = "timing_end_time")
	private Timestamp timing_end_time;

    // 当前位置
    @TableField(value = "location_address")
    private String location_address;
    // 当前位置经度
    @TableField(value = "location_lng")
    private String location_lng;
    // 当前位置纬度
    @TableField(value = "location_lat")
    private String location_lat;



}
