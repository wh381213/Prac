package com.example.p1.services;

import com.example.p1.models.Board;
import com.example.p1.repositories.BoardsRepository;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardsService {
    @Autowired
    private BoardsRepository boardsRepository;

    public List<Board> read() {
        return boardsRepository.read();
    }
    public Board detail(Integer boardPk) {
        return boardsRepository.detail(boardPk);
    }
    public Integer create(Board board) {
        return boardsRepository.create(board);
    }

    public Integer delete(Integer boardPk) {
        return boardsRepository.delete(boardPk);
    }

    public Integer update(@Param("boardPk") Integer boardPk, @Param("board") Board board) {
        return boardsRepository.update(boardPk, board);
    }
}