package com.example.p1.models;

import java.time.LocalDateTime;

public class Board {
    private Integer boardPk;
    private Integer memberPk;
    private String title;
    private String contents;

    private LocalDateTime createdAt;

    public Board(Integer boardPk, Integer memberPk, String title, String contents, LocalDateTime createdAt) {
        this.boardPk = boardPk;
        this.memberPk = memberPk;
        this.title = title;
        this.contents = contents;
        this.createdAt = createdAt;
    }

    public Integer getBoardPk() {
        return boardPk;
    }

    public void setBoardPk(Integer boardPk) {
        this.boardPk = boardPk;
    }

    public Integer getMemberPk() {
        return memberPk;
    }

    public void setMemberPk(Integer memberPk) {
        this.memberPk = memberPk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}



