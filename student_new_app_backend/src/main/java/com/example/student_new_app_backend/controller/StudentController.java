package com.example.student_new_app_backend.controller;

import com.example.student_new_app_backend.model.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
  @GetMapping("/")
    public  String Homepage(){

    return "Welcome to website";
    }
  @PostMapping(path = "/add" ,consumes ="application/json", produces = "application/json")
  public String AddStudent( @RequestBody  Students students){
    System.out.println(students.getName());


    return "Student Added ";
  }
}
