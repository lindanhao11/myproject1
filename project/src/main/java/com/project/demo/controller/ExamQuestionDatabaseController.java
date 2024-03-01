package com.project.demo.controller;

import com.project.demo.controller.base.BaseController;
import com.project.demo.entity.ExamQuestionDatabase;
import com.project.demo.service.ExamQuestionDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 题库
 *
 */
@RestController
@RequestMapping("exam_question_database")
public class ExamQuestionDatabaseController extends BaseController<ExamQuestionDatabase, ExamQuestionDatabaseService> {
    /**
     * 服务对象
     */
    @Autowired
    public ExamQuestionDatabaseController(ExamQuestionDatabaseService service) {
        setService(service);
    }

}


