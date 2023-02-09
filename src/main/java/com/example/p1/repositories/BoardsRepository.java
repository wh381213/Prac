package com.example.p1.repositories;

import com.example.p1.models.Board;
import com.example.p1.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardsRepository {
//    @Select("select * from users")
    List<Board> read();
    Integer create(Board board);
    Integer delete(Integer boardPk);
    Integer update(@Param("boardPk") Integer boardPk, @Param("board") Board board);
}
