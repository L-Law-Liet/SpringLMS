package kz.sitedev.lms.entity;


import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

public class Status {
    @Id
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "statusReq")
    private List<Req> reqStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Req> getReqStatus() {
        return reqStatus;
    }

    public void setReqStatus(List<Req> reqStatus) {
        this.reqStatus = reqStatus;
    }
}
