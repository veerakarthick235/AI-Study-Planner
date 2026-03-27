package com.study.planner.controller;

import com.study.planner.model.Progress;
import com.study.planner.repository.ProgressRepository;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/progress")
@CrossOrigin("*")
public class ProgressController {

    private final ProgressRepository repo;

    public ProgressController(ProgressRepository repo){
        this.repo = repo;
    }

    @PostMapping
    public Progress saveProgress(@RequestBody Progress progress){

        return repo.save(progress);

    }

    @GetMapping("/{userId}")
    public Progress getProgress(@PathVariable Long userId){

        return repo.findByUserId(userId);

    }

}