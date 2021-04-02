package kz.sitedev.lms.controller;

import kz.sitedev.lms.entity.Book;
import kz.sitedev.lms.entity.StatusReq;
import kz.sitedev.lms.service.BookService;
import kz.sitedev.lms.service.StatusReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StatusReqsController {
    @Autowired
    StatusReqService statusReqService;

    public StatusReq findFirstByReqId(Long id){
        return statusReqService.findFirstByReqId(id);
    }
    public List<StatusReq> findByStatusId(Long id){
        return statusReqService.findByStatusId(id);
    }

}
