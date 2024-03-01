package com.project.demo.controller;

import com.project.demo.controller.base.BaseController;
import com.project.demo.entity.SubjectExam;
import com.project.demo.service.SubjectExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 科目模块的考试
 *
 */
@RestController
@RequestMapping("subject_exam")
public class SubjectExamController extends BaseController<SubjectExam, SubjectExamService> {
    /**
     * 服务对象
     */
    @Autowired
    public SubjectExamController(SubjectExamService service) {
        setService(service);
    }

}


