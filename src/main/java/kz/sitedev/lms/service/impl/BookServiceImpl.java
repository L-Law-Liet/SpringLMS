package kz.sitedev.lms.service.impl;

import kz.sitedev.lms.entity.Book;
import kz.sitedev.lms.entity.StatusReq;
import kz.sitedev.lms.repository.BookRepository;
import kz.sitedev.lms.repository.ReqRepository;
import kz.sitedev.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> findByTitle(String name) {
        return bookRepository.findByTitle(name);
    }

    @Override
    public List<Book> getByDescription(String name) {
        return bookRepository.getByDescription(name);
    }

    @Override
    public List<Book> getByAuthor(String name) {
        return bookRepository.getByAuthor(name);
    }
    public void create(Book book) {

        bookRepository.save(book);
    }
}
