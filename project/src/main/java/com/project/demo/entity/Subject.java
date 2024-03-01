package com.project.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 科目
 */
@TableName("subject")
@Data
@EqualsAndHashCode(callSuper = false)
public class Subject implements Serializable {

    private static final long serialVersionUID = -89845695959527153L;

    /**
     * 科目id
     */
    @TableId(value = "subject_id", type = IdType.AUTO)
    private Integer subject_id;

    /**
     * 科目名称
     */
    @TableField(value = "name")
    private String name;

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

