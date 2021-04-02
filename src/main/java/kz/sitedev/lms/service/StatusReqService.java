package kz.sitedev.lms.service;

import kz.sitedev.lms.entity.StatusReq;
import kz.sitedev.lms.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StatusReqService {
    List<StatusReq> findByStatusId(Long statusId);
    StatusReq findFirstByReqId(Long statusId);
    void create(StatusReq statusReq);
}
