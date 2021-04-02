package kz.sitedev.lms.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class Req {
    @Id
    private Long id;
    private Long userId;
    private Long bookId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToMany
    @JoinTable(
            name = "status_reqs",
            joinColumns = @JoinColumn(name = "req_id"),
            inverseJoinColumns = @JoinColumn(name = "status_id"))
    private List<Status> statusReq;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Status> getStatusReq() {
        return statusReq;
    }

    public void setStatusReq(List<Status> statusReq) {
        this.statusReq = statusReq;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
}
