package com.study.planner.controller;

import com.study.planner.model.StudyProfile;
import com.study.planner.repository.StudyProfileRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin("*")
public class StudyProfileController {

    private final StudyProfileRepository repository;

    public StudyProfileController(StudyProfileRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public StudyProfile saveProfile(@RequestBody StudyProfile profile){
        return repository.save(profile);
    }

    @GetMapping("/{userId}")
    public StudyProfile getProfile(@PathVariable Long userId){
        return repository.findByUserId(userId);
    }
}