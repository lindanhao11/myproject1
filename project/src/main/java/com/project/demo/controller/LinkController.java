package com.project.demo.controller;

import com.project.demo.entity.Link;
import com.project.demo.service.LinkService;

import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

/**
 * 友情链接：(Link)表控制层
 *
 */
@RestController
@RequestMapping("link")
public class LinkController extends BaseController<Link, LinkService> {
    /**
     * 服务对象
     */
    @Autowired
    public LinkController(LinkService service) {
        setService(service);
    }

}


