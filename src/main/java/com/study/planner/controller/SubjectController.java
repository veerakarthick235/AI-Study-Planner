package com.study.planner.controller;

import com.study.planner.model.Subject;
import com.study.planner.repository.SubjectRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/subjects")
@CrossOrigin("*")
public class SubjectController {

    private final SubjectRepository repository;

    public SubjectController(SubjectRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public Subject addSubject(@RequestBody Subject subject){
        return repository.save(subject);
    }

    @GetMapping("/{userId}")
    public List<Subject> getSubjects(@PathVariable Long userId){
        return repository.findByUserId(userId);
    }
}