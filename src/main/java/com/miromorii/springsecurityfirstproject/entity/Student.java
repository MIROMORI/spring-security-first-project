package com.miromorii.springsecurityfirstproject.entity;

public class Student {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
