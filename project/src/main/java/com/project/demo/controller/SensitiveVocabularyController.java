package com.project.demo.controller;

import com.project.demo.entity.SensitiveVocabulary;
import com.project.demo.service.SensitiveVocabularyService;

import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

/**
 * 敏感词汇：(SensitiveVocabulary)表控制层
 *
 */
@RestController
@RequestMapping("/sensitive_vocabulary")
public class SensitiveVocabularyController extends BaseController<SensitiveVocabulary, SensitiveVocabularyService> {

    /**
     * 敏感词汇对象
     */
    @Autowired
    public SensitiveVocabularyController(SensitiveVocabularyService service) {
        setService(service);
    }

}
