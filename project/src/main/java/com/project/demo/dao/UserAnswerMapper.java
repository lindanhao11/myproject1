package com.project.demo.dao;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.UserAnswer;
import org.apache.ibatis.annotations.Mapper;


/**
 * 考试人员：Mapper接口
 *
 */
@Mapper
public interface UserAnswerMapper extends BaseMapper<UserAnswer>
{
}
