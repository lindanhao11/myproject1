package com.project.demo.controller;

import com.project.demo.controller.base.BaseController;
import com.project.demo.entity.NovelChapters;
import com.project.demo.service.NovelChaptersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 题库
 *
 */
@RestController
@RequestMapping("novel_chapters")
public class NovelChaptersController extends BaseController<NovelChapters, NovelChaptersService> {
    /**
     * 服务对象
     */
    @Autowired
    public NovelChaptersController(NovelChaptersService service) {
        setService(service);
    }

}


