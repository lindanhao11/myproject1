package com.project.demo.controller;

import com.project.demo.controller.base.BaseController;
import com.project.demo.entity.SubjectExamQuestion;
import com.project.demo.service.SubjectExamQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 科目模块-题库
 *
 */
@RestController
@RequestMapping("subject_exam_question")
public class SubjectExamQuestionController extends BaseController<SubjectExamQuestion, SubjectExamQuestionService> {
    /**
     * 服务对象
     */
    @Autowired
    public SubjectExamQuestionController(SubjectExamQuestionService service) {
        setService(service);
    }

}


