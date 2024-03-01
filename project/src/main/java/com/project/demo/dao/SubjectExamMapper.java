package com.project.demo.dao;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.SubjectExam;
import org.apache.ibatis.annotations.Mapper;

/**
 * 科目模块的考试：Mapper接口
 *
 */
@Mapper
interface SubjectExamMapper extends BaseMapper<SubjectExam> {
}
