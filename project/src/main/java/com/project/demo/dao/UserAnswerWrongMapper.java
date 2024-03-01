package com.project.demo.dao;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.UserAnswerWrong;
import org.apache.ibatis.annotations.Mapper;

/**
 * 科目模块-错题记录：Mapper接口
 *
 */
@Mapper
interface UserAnswerWrongMapper extends BaseMapper<UserAnswerWrong> {
}
