package kz.sitedev.lms.controller;

import kz.sitedev.lms.entity.Book;
import kz.sitedev.lms.entity.User;
import kz.sitedev.lms.service.BookService;
import kz.sitedev.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BooksController {
    @Autowired
    BookService bookService;

   public List<Book> getByAuthor(String name){
        return bookService.getByAuthor(name);
    }
    public List<Book> getByDescription(String name){
        return bookService.getByDescription(name);
    }
    public List<Book> findByTitle(String name){
        return bookService.findByTitle(name);
    }
    public void create(Book book){
       bookService.create(book);
    }
}
