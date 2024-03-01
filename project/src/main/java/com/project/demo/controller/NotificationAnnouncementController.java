package com.project.demo.controller;

import com.project.demo.entity.NotificationAnnouncement;
import com.project.demo.service.NotificationAnnouncementService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 通知公告：(NotificationAnnouncement)表控制层
 *
 */
@RestController
@RequestMapping("/notification_announcement")
public class NotificationAnnouncementController extends BaseController<NotificationAnnouncement, NotificationAnnouncementService> {

    /**
     * 通知公告对象
     */
    @Autowired
    public NotificationAnnouncementController(NotificationAnnouncementService service) {
        setService(service);
    }



    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }


}
