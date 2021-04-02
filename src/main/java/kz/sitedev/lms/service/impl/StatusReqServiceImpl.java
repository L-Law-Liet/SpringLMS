package kz.sitedev.lms.service.impl;

import kz.sitedev.lms.entity.StatusReq;
import kz.sitedev.lms.repository.StatusReqRepository;
import kz.sitedev.lms.service.StatusReqService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StatusReqServiceImpl implements StatusReqService {
    @Autowired
    StatusReqRepository statusReqRepository;
    @Override
    public StatusReq findByReqId(Long reqId){
        return statusReqRepository.findFirstByReqId(reqId);
    };
    @Override
    public List<StatusReq> findByStatusId(Long statusId) {
        return statusReqRepository.findByStatusId(statusId);
    }
    public void create(StatusReq statusReq) {
        statusReqRepository.save(statusReq);
    }
}
