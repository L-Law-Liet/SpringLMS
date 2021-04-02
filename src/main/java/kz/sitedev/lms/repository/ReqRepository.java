package kz.sitedev.lms.repository;

import kz.sitedev.lms.entity.Req;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReqRepository extends JpaRepository<Req, Long> {

    List<Req> findAll();

    Req findReqById(Long id);
}
