package com.example.p1.models;

import java.time.LocalDateTime;

public class Board {
    private Integer boardPk;
    private Integer userPk;
    private String title;
    private String contents;

    private LocalDateTime createdAt;

    public Board(Integer boardPk, Integer userPk, String title, String contents, LocalDateTime createdAt) {
        this.boardPk = boardPk;
        this.userPk = userPk;
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

    public Integer getUserPk() {
        return userPk;
    }

    public void setUserPk(Integer userPk) {
        this.userPk = userPk;
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



