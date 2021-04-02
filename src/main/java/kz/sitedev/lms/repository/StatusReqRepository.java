package kz.sitedev.lms.repository;

import kz.sitedev.lms.entity.Req;
import kz.sitedev.lms.entity.StatusReq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusReqRepository extends JpaRepository<StatusReq, Long> {
    List<StatusReq> findByStatusId(Long statusId);
    StatusReq findFirstByReqId(Long statusId);
}
