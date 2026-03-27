package com.study.planner.repository;

import com.study.planner.model.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressRepository extends JpaRepository<Progress,Long>{

    Progress findByUserId(Long userId);

}