package com.example.student_new_app_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
  @GetMapping("/")
    public  String Homepage(){
        return "Welcome to website";
    }
}
