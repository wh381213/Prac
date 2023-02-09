package com.example.p1.repositories;

import com.example.p1.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SearchRepository {
//    @Select("select * from users")
    List<User> search(String q);
}
