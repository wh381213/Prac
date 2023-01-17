package com.example.p1.controllers;

import com.example.p1.models.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    ModelAndView search(@RequestParam(required = false) String q) {
        List<Member> members = new ArrayList<>();
        for (int index = 0; index < MembersController.members.size(); index++) {
            Member member = MembersController.members.get(index);
            if (q == null || member.getName().contains(q)) {
                members.add(member);
            }
        }
        ModelAndView modelAndView = new ModelAndView("search");
        modelAndView.addObject("result", "search");
        modelAndView.addObject("members", members);
        return modelAndView;
    }
}
