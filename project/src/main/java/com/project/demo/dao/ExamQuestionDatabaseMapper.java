package com.project.demo.dao;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.ExamQuestionDatabase;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题库：Mapper接口
 *
 */
@Mapper
interface ExamQuestionDatabaseMapper extends BaseMapper<ExamQuestionDatabase> {
}
