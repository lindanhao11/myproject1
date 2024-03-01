package com.project.demo.controller;

import com.project.demo.controller.base.BaseController;
import com.project.demo.entity.Subject;
import com.project.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 考试
 *
 */
@RestController
@RequestMapping("subject")
public class SubjectController extends BaseController<Subject, SubjectService> {
    /**
     * 服务对象
     */
    @Autowired
    public SubjectController(SubjectService service) {
        setService(service);
    }

}


