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
 * 学生选课：(StudentCourseSelection)表实体类
 *
 */
@TableName("`student_course_selection`")
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentCourseSelection implements Serializable {

    // StudentCourseSelection编号
    @TableId(value = "student_course_selection_id", type = IdType.AUTO)
    private Integer student_course_selection_id;

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
    // 学生用户
    @TableField(value = "`student_users`")
    private Integer student_users;
    // 姓名
    @TableField(value = "`name`")
    private String name;
    // 人数
    @TableField(value = "`number_of_people`")
    private Integer number_of_people;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
