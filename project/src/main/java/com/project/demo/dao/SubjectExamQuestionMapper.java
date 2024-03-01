package com.project.demo.dao;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.SubjectExamQuestion;
import org.apache.ibatis.annotations.Mapper;

/**
 * 科目模块-题库：Mapper接口
 *
 */
@Mapper
interface SubjectExamQuestionMapper extends BaseMapper<SubjectExamQuestion> {
}
