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
 * 课程成绩：(CourseGrades)表实体类
 *
 */
@TableName("`course_grades`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseGrades implements Serializable {

    // CourseGrades编号
    @TableId(value = "course_grades_id", type = IdType.AUTO)
    private Integer course_grades_id;

    // 课程名称
    @TableField(value = "`course_name`")
    private String course_name;
    // 课程编号
    @TableField(value = "`course_id`")
    private String course_id;
    // 任课教师
    @TableField(value = "`teacher`")
    private Integer teacher;
    // 考试名称
    @TableField(value = "`exam_name`")
    private String exam_name;
    // 考试成绩
    @TableField(value = "`exam_scores`")
    private Integer exam_scores;
    // 平均分
    @TableField(value = "`average_score`")
    private Integer average_score;
    // 最高分
    @TableField(value = "`maximum_score`")
    private Integer maximum_score;
    // 最低分
    @TableField(value = "`lowest_score`")
    private Integer lowest_score;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
