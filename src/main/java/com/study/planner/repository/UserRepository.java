package com.study.planner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.study.planner.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}