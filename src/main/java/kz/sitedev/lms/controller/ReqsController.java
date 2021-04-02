package kz.sitedev.lms.controller;

import kz.sitedev.lms.entity.Req;
import kz.sitedev.lms.service.ReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class ReqsController {
    @Autowired
    ReqService reqService;

    public List<Req> getAll(){
        return reqService.getAll();
    };
    public void create(Req req){
        reqService.create(req);
    };

    public Req find(Long id){
        return reqService.find(id);
    };

}
