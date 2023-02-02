package com.example.p1.controllers;

import com.example.p1.models.Board;
import com.example.p1.services.BoardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardsController {
    @Autowired
    private BoardsService boardsService;
    
    @RequestMapping(value = "/boardsRead", method = RequestMethod.GET)
    ModelAndView boardsRead() {
        List<Board> boards = boardsService.read();
        ModelAndView modelAndView = new ModelAndView("boards");
        modelAndView.addObject("result", "read");
        modelAndView.addObject("boards", boards);
        return modelAndView;
    }
    @RequestMapping(value = "/boardsCreate", method = RequestMethod.GET)
    ModelAndView boardsCreate() {
        List<Board> boards = boardsService.read();
        ModelAndView modelAndView = new ModelAndView("boardsCreate");
        modelAndView.addObject("result", "read");
        modelAndView.addObject("boards", boards);
        return modelAndView;
    }

    @RequestMapping(value = "/boardsCreate", method = RequestMethod.POST)
    @ResponseBody
    String boardsCreate(Board board) {
        boardsService.create(board);
        return "<script>document.location.href = '/boardsRead';</script>";
    }
    @RequestMapping(value = "/boardsDetail", method = RequestMethod.GET)
    ModelAndView boardsDetail() {
        List<Board> boards = boardsService.read();
        ModelAndView modelAndView = new ModelAndView("boardsDetail");
        modelAndView.addObject("result", "read");
        modelAndView.addObject("boards", boards);
        return modelAndView;
    }
    @RequestMapping(value = "/boardsDelete/{boardPk}", method = RequestMethod.POST)
    @ResponseBody
    String boardsDelete(@PathVariable("boardPk") int boardPk) {
        boardsService.delete(boardPk);
        return "<script>document.location.href = '/boardsRead';</script>";
    }

    @RequestMapping(value = "/boardsUpdate/{boardPk}", method = RequestMethod.POST)
    @ResponseBody
    String boardsUpdate(
            @PathVariable("boardPk") int boardPk,
            Board board
    ) {
        boardsService.update(boardPk, board);
        return "<script>document.location.href = '/boardsRead';</script>";
    }
}
