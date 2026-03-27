package com.study.planner.controller;

import com.study.planner.model.User;
import com.study.planner.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    private final UserRepository userRepository;

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {

        if(userRepository.findByUsername(user.getUsername()) != null) {
            return "Username already exists";
        }

        userRepository.save(user);

        return "User Registered Successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User existing = userRepository.findByUsername(user.getUsername());

        if(existing != null && existing.getPassword().equals(user.getPassword())) {
            return "Login success";
        }

        return "Invalid credentials";
    }

}