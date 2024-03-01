package com.project.demo.dao;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.SubjectUserAnswer;
import org.apache.ibatis.annotations.Mapper;

/**
 * 科目模块-用户答题：Mapper接口
 *
 */
@Mapper
interface SubjectUserAnswerMapper extends BaseMapper<SubjectUserAnswer> {
}
