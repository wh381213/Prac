package com.example.p1.services;

import com.example.p1.models.Member;
import com.example.p1.repositories.MembersRepository;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersService {
    @Autowired
    private MembersRepository membersRepository;

    public List<Member> read() {
        return membersRepository.read();
    }

    public Integer create(Member member) {
        return membersRepository.create(member);
    }

    public Integer delete(Integer memberPk) {
        return membersRepository.delete(memberPk);
    }

    public Integer update(@Param("memberPk") Integer memberPk, @Param("member") Member member) {
        return membersRepository.update(memberPk, member);
    }
}