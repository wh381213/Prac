package com.example.p1.repositories;

import com.example.p1.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsersRepository {
//    @Select("select * from users")
    List<User> read();
    Integer create(User user);
    Integer delete(Integer userPk);
    Integer update(@Param("userPk") Integer userPk, @Param("user") User user);
}
