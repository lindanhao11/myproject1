package com.project.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 敏感词汇：(SensitiveVocabulary)表实体类
 *
 */
@TableName("`sensitive_vocabulary`")
@Data
@EqualsAndHashCode(callSuper = false)
public class SensitiveVocabulary implements Serializable {

    /**
     * SensitiveVocabulary编号
     */
    @TableId(value = "sensitive_vocabulary_id", type = IdType.AUTO)
    private Integer sensitive_vocabulary_id;

    /**
     * 敏感词汇
     */
    @TableField(value = "`sensitive_vocabulary`")
    private String sensitive_vocabulary;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Timestamp update_time;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Timestamp create_time;

}
