package com.study.planner.model;

import jakarta.persistence.*;

@Entity
@Table(name="study_profiles")
public class StudyProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private int hoursPerDay;

    private String startTime;

    public Long getId(){ return id; }
    public void setId(Long id){ this.id=id; }

    public Long getUserId(){ return userId; }
    public void setUserId(Long userId){ this.userId=userId; }

    public int getHoursPerDay(){ return hoursPerDay; }
    public void setHoursPerDay(int hoursPerDay){ this.hoursPerDay=hoursPerDay; }

    public String getStartTime(){ return startTime; }
    public void setStartTime(String startTime){ this.startTime=startTime; }
}