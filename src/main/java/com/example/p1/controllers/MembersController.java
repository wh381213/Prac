package com.example.p1.controllers;

import com.example.p1.models.Member;
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
    private SqlSessionFactory sqlSessionFactory;
    private static List<Member> init() {
        List<Member> members = new ArrayList<>();
        members.add(new Member(1,"홍길동", 39));
        members.add(new Member(2,"김삼순", 33));
        members.add(new Member(3,"홍명보", 44));
        members.add(new Member(4,"박지삼", 22));
        members.add(new Member(5,"권명순", 10)); // Mock 데이터
        return members;
    }
    public static final List<Member> members = init();

    @RequestMapping(value = "/membersRead", method = RequestMethod.GET)
    ModelAndView membersRead() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Member> members = sqlSession.selectList("com.example.p1.repositories.MembersRepository.read");

        ModelAndView modelAndView = new ModelAndView("members");
        modelAndView.addObject("result", "read");
        modelAndView.addObject("members", members);
        return modelAndView;
    }
    @RequestMapping(value = "/membersCreate", method = RequestMethod.POST)
    @ResponseBody
    String membersCreate(Member member) {
        members.add(member);
        return "<script>document.location.href = '/membersRead';</script>";
    }

    @RequestMapping(value = "/membersDelete/{index}", method = RequestMethod.POST)
    @ResponseBody
    String membersDelete(@PathVariable("index") int index) {
        members.remove(index);
        return "<script>document.location.href = '/membersRead';</script>";
    }

    @RequestMapping(value = "/membersUpdate/{index}", method = RequestMethod.POST)
    @ResponseBody
    String membersUpdate(
            @PathVariable("index") int index,
            Member member
    ) {
        members.set(index, member);
        return "<script>document.location.href = '/membersRead';</script>";
    }
}
