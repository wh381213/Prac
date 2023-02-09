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
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/usersRead", method = RequestMethod.GET)
    ModelAndView usersRead() {
        List<User> users = usersService.read();
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("result", "read");
        modelAndView.addObject("users", users);
        return modelAndView;
    }
    @RequestMapping(value = "/usersCreate", method = RequestMethod.POST)
    @ResponseBody
    String usersCreate(User user) {
        usersService.create(user);
        return "<script>document.location.href = '/usersRead';</script>";
    }

    @RequestMapping(value = "/usersDelete/{userPk}", method = RequestMethod.POST)
    @ResponseBody
    String usersDelete(@PathVariable("userPk") int userPk) {
        usersService.delete(userPk);
        return "<script>document.location.href = '/usersRead';</script>";
    }

    @RequestMapping(value = "/usersUpdate/{userPk}", method = RequestMethod.POST)
    @ResponseBody
    String usersUpdate(
            @PathVariable("userPk") int userPk,
            User user
    ) {
        usersService.update(userPk, user);
        return "<script>document.location.href = '/usersRead';</script>";
    }
}
