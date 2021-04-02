package kz.sitedev.lms.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "status_reqs")
public class StatusReq {
    private Long reqId;
    private Long statusId;

    public Long getReqId() {
        return reqId;
    }

    public void setReqId(Long reqId) {
        this.reqId = reqId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }
}
