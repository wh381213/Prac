package com.example.p1.repositories;

import com.example.p1.models.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MembersRepository {
//    @Select("select * from members")
    List<Member> read();
    Integer create(Member member);
    Integer delete(Integer memberPk);
    Integer update(@Param("memberPk") Integer memberPk, @Param("member") Member member);
}
