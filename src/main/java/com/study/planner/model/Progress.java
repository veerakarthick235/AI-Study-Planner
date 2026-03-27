package com.study.planner.model;

import jakarta.persistence.*;

@Entity
@Table(name="progress")
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private int progressPercentage;

    private int completedTasks;

    private int streak;

    public Long getId(){ return id; }
    public void setId(Long id){ this.id=id; }

    public Long getUserId(){ return userId; }
    public void setUserId(Long userId){ this.userId=userId; }

    public int getProgressPercentage(){ return progressPercentage; }
    public void setProgressPercentage(int progressPercentage){ this.progressPercentage=progressPercentage; }

    public int getCompletedTasks(){ return completedTasks; }
    public void setCompletedTasks(int completedTasks){ this.completedTasks=completedTasks; }

    public int getStreak(){ return streak; }
    public void setStreak(int streak){ this.streak=streak; }
}