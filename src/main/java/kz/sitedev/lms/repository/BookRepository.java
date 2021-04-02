package kz.sitedev.lms.repository;

import kz.sitedev.lms.entity.Book;
import kz.sitedev.lms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitle(String name);
    List<Book> getByDescription(String name);
    List<Book> getByAuthor(String name);
}
