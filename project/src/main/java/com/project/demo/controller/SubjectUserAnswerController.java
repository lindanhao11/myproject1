package com.project.demo.controller;

import com.project.demo.controller.base.BaseController;
import com.project.demo.entity.SubjectUserAnswer;
import com.project.demo.service.SubjectUserAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 科目模块-用户答题
 */
@RestController
@RequestMapping("subject_user_answer")
public class SubjectUserAnswerController extends BaseController<SubjectUserAnswer, SubjectUserAnswerService> {
    /**
     * 服务对象
     */
    @Autowired
    public SubjectUserAnswerController(SubjectUserAnswerService service) {
        setService(service);
    }

}


