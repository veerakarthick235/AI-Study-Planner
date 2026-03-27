package com.study.planner.model;

import jakarta.persistence.*;

@Entity
@Table(name="study_schedule")
public class StudySchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String subjectName;

    private int studyHours;

    private String studyDate;

    public Long getId(){ return id; }
    public void setId(Long id){ this.id=id; }

    public Long getUserId(){ return userId; }
    public void setUserId(Long userId){ this.userId=userId; }

    public String getSubjectName(){ return subjectName; }
    public void setSubjectName(String subjectName){ this.subjectName=subjectName; }

    public int getStudyHours(){ return studyHours; }
    public void setStudyHours(int studyHours){ this.studyHours=studyHours; }

    public String getStudyDate(){ return studyDate; }
    public void setStudyDate(String studyDate){ this.studyDate=studyDate; }
}