package kz.sitedev.lms.controller;

import kz.sitedev.lms.entity.User;
import kz.sitedev.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    UserService userService;

   public List<User> all(){
        return userService.getAll();
    }
}
