package com.project.demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 错题记录
 */
@Setter
@Getter
@Entity
public class UserAnswerWrong implements Serializable {

    private static final long serialVersionUID = -89845695959527153L;

    /**
     * 用户答题id：[0,10000]
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_answer_id")
    private Integer user_answer_id;

    /**
     * 科目名称
     */
    @Basic
    @Column(name = "subject_name")
    private String subject_name;

    /**
     * 题目类型
     */
    @Basic
    @Column(name = "type")
    private String type;

    /**
     * 题目
     */
    @Basic
    @Column(name = "title")
    private String title;

    /**
     * 选项
     */
    @Basic
    @Column(name = "question_item")
    private String question_item;

    /**
     * 试卷id
     */
    @Basic
    @Column(name = "exam_id")
    private Integer exam_id;

    /**
     * 评分状态
     */
    @Basic
    @Column(name = "score_state")
    private Integer score_state;

    /**
     * 分数
     */
    @Basic
    @Column(name = "score")
    private Double score;

    /**
     * 用户提交的答案
     */
    @Basic
    @Column(name = "answers")
    private String answers;

    /**
     * 参考答案
     */
    @Basic
    @Column(name = "answer")
    private String answer;

    /**
     * 评分详情
     */
    @Basic
    @Column(name = "score_detail")
    private String score_detail;

    /**
     * 提交人
     */
    @Basic
    @Column(name = "nickname")
    private String nickname;

    /**
     * 提交人ID
     */
    @Basic
    @Column(name = "user_id")
    private Integer user_id;

    /**
     * 客观题得分
     */
    @Basic
    @Column(name = "objective_score")
    private Double objective_score;

    /**
     * 主观题得分
     */
    @Basic
    @Column(name = "subjective_score")
    private Double subjective_score;

    /**
     * 创建时间：
     */

    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;

    /**
     * 更新时间：
     */

    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;

}

