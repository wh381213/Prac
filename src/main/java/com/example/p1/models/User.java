package com.example.p1.models;

public class User {
    private String name;
    private Integer age;

    private Integer userPk;

    public User(Integer userPk, String name, Integer age) {
        this.name = name;
        this.age = age;
        this.userPk = userPk;
    }

    public Integer getUserPk() {
        return userPk;
    }

    public void setUserPk(Integer userPk) {
        this.userPk = userPk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
