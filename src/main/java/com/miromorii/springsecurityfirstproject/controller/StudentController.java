package com.miromorii.springsecurityfirstproject.controller;

import com.miromorii.springsecurityfirstproject.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/students")
public class StudentController {

    private List<Student> students = List.of(new Student(1, "Evellyn beatriz"),
                                                new Student(2, "marcos"),
                                                new Student(3, "pedro sampaio"));

    @GetMapping("{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer id){ //refatorar para findById()
        return students.stream()
                .filter(student -> id.equals(student.getId()))
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
