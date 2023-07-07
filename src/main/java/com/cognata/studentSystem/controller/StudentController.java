package com.cognata.studentSystem.controller;

import com.cognata.studentSystem.model.Student;
import com.cognata.studentSystem.serivce.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student has been added";
    }

    @GetMapping("/getAll")
        public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
