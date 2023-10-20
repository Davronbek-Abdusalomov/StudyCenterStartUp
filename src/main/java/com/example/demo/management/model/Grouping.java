package com.example.demo.management.model;

import com.example.demo.quiz.model.Test;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Grouping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @ManyToMany
    private List<Student> students;

    @ManyToMany
    private List<Test> tests;

    @ManyToOne
    private Teacher teacher;
}
