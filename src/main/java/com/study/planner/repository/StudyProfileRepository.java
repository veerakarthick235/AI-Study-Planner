package com.study.planner.repository;

import com.study.planner.model.StudyProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyProfileRepository extends JpaRepository<StudyProfile,Long>{

    StudyProfile findByUserId(Long userId);

}