package com.study.planner.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String name;

    private int difficulty;

    private LocalDate examDate;

    public Long getId(){ return id; }
    public void setId(Long id){ this.id=id; }

    public Long getUserId(){ return userId; }
    public void setUserId(Long userId){ this.userId=userId; }

    public String getName(){ return name; }
    public void setName(String name){ this.name=name; }

    public int getDifficulty(){ return difficulty; }
    public void setDifficulty(int difficulty){ this.difficulty=difficulty; }

    public LocalDate getExamDate(){ return examDate; }
    public void setExamDate(LocalDate examDate){ this.examDate=examDate; }
}