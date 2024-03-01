package com.project.demo.dao;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.Subject;
import org.apache.ibatis.annotations.Mapper;

/**
 * 考试：Mapper接口
 *
 */
@Mapper
interface SubjectMapper extends BaseMapper<Subject> {
}
