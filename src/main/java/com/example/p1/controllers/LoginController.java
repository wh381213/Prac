package com.example.p1.controllers;

import com.example.p1.models.User;
import com.example.p1.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    String logout(User user) {
        usersService.create(user);
        return "<script>document.location.href = '/usersRead';</script>";
    }
}
