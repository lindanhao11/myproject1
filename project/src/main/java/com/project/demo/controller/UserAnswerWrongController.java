package com.project.demo.controller;

import com.project.demo.controller.base.BaseController;
import com.project.demo.entity.UserAnswerWrong;
import com.project.demo.service.UserAnswerWrongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 错题记录
 */
@RestController
@RequestMapping("user_answer_wrong")
public class UserAnswerWrongController extends BaseController<UserAnswerWrong, UserAnswerWrongService> {
    /**
     * 服务对象
     */
    @Autowired
    public UserAnswerWrongController(UserAnswerWrongService service) {
        setService(service);
    }

}


