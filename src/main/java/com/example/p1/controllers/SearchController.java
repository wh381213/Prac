package com.example.p1.controllers;

import com.example.p1.models.Member;
import com.example.p1.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {
    @Autowired
    private SearchService searchService;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    ModelAndView search(@RequestParam(required = false) String q) {
        List<Member> members = searchService.search(q);
        ModelAndView modelAndView = new ModelAndView("search");
        modelAndView.addObject("result", "search");
        modelAndView.addObject("members", members);
        return modelAndView;
    }
}
