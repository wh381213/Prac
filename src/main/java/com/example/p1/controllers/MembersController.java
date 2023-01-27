package com.example.p1.controllers;

import com.example.p1.models.Member;
import com.example.p1.repositories.MembersRepository;
import com.example.p1.services.MembersService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MembersController {
    @Autowired
    private MembersService membersService;

    @RequestMapping(value = "/membersRead", method = RequestMethod.GET)
    ModelAndView membersRead() {
        List<Member> members = membersService.read();
        ModelAndView modelAndView = new ModelAndView("members");
        modelAndView.addObject("result", "read");
        modelAndView.addObject("members", members);
        return modelAndView;
    }
    @RequestMapping(value = "/membersCreate", method = RequestMethod.POST)
    @ResponseBody
    String membersCreate(Member member) {
        membersService.create(member);
        return "<script>document.location.href = '/membersRead';</script>";
    }

    @RequestMapping(value = "/membersDelete/{memberPk}", method = RequestMethod.POST)
    @ResponseBody
    String membersDelete(@PathVariable("memberPk") int memberPk) {
        membersService.delete(memberPk);
        return "<script>document.location.href = '/membersRead';</script>";
    }

    @RequestMapping(value = "/membersUpdate/{memberPk}", method = RequestMethod.POST)
    @ResponseBody
    String membersUpdate(
            @PathVariable("memberPk") int memberPk,
            Member member
    ) {
        membersService.update(memberPk, member);
        return "<script>document.location.href = '/membersRead';</script>";
    }
}
