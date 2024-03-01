package com.project.demo.controller;

import com.project.demo.entity.Ad;
import com.project.demo.service.AdService;

import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

/**
 * 广告信息：(Ad)表控制层
 *
 */
@RestController
@RequestMapping("ad")
public class AdController extends BaseController<Ad, AdService> {
    /**
     * 服务对象
     */
    @Autowired
    public AdController(AdService service) {
        setService(service);
    }

}


