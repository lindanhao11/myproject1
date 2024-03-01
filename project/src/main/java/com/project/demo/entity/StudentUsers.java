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
 * 学生用户：(StudentUsers)表实体类
 *
 */
@TableName("`student_users`")
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentUsers implements Serializable {

    // StudentUsers编号
    @TableId(value = "student_users_id", type = IdType.AUTO)
    private Integer student_users_id;

    // 姓名
    @TableField(value = "`name`")
    private String name;
    // 编号
    @TableField(value = "`number`")
    private String number;
    // 类别
    @TableField(value = "`category`")
    private String category;
    // 商品编号
    @TableField(value = "`product_number`")
    private String product_number;
    // 性别
    @TableField(value = "`gender`")
    private String gender;
    // 简历
    @TableField(value = "`resume`")
    private String resume;
    // 备注
    @TableField(value = "`remarks`")
    private String remarks;
    // 营业执照
    @TableField(value = "`business_license`")
    private String business_license;







    // 用户编号
    @TableField(value = "user_id")
    private Integer userId;



    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
