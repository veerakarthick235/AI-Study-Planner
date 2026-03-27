package com.study.planner.model;

import jakarta.persistence.*;

@Entity
@Table(name="study_tasks")
public class StudyTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String subjectName;

    private int studyHours;

    private boolean completed;

    public Long getId(){ return id; }
    public void setId(Long id){ this.id=id; }

    public Long getUserId(){ return userId; }
    public void setUserId(Long userId){ this.userId=userId; }

    public String getSubjectName(){ return subjectName; }
    public void setSubjectName(String subjectName){ this.subjectName=subjectName; }

    public int getStudyHours(){ return studyHours; }
    public void setStudyHours(int studyHours){ this.studyHours=studyHours; }

    public boolean isCompleted(){ return completed; }
    public void setCompleted(boolean completed){ this.completed=completed; }
}