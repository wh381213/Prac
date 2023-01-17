package com.example.p1.models;

public class Member {
    private String name;
    private Integer age;

    private Integer memberPk;

    public Member(Integer memberPk, String name, Integer age) {
        this.name = name;
        this.age = age;
        this.memberPk = memberPk;
    }

    public Integer getMemberPk() {
        return memberPk;
    }

    public void setMemberPk(Integer memberPk) {
        this.memberPk = memberPk;
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
