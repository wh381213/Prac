package com.example.p1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/")
    @ResponseBody
    String root(){
        return "<script>document.location.href = '/usersRead';</script>";
    }
}
