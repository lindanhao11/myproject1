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
 * 试题库
 */
@TableName("exam_question_database")
@Data
@EqualsAndHashCode(callSuper = false)
public class ExamQuestionDatabase implements Serializable {

    private static final long serialVersionUID = -89845695959527153L;

    /**
     * 题库id：[0,10000]
     */
    @TableId(value = "exam_question_id", type = IdType.AUTO)
    private Integer exam_question_id;

    /**
     * 科目名称
     */
    @TableField(value = "subject_name")
    private String subject_name;

    /**
     * 类型
     */
    @TableField(value = "type")
    private String type;

    /**
     * 题目
     */
    @TableField(value = "title")
    private String title;

    /**
     * 选项
     */
    @TableField(value = "question_item")
    private String question_item;

    /**
     * 参考答案
     */
    @TableField(value = "answer")
    private String answer;

    /**
     * 总分
     */
    @TableField(value = "score")
    private Double score;

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

