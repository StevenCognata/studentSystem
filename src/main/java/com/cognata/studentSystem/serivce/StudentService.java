package com.cognata.studentSystem.serivce;

import com.cognata.studentSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent (Student student);
    public List<Student> getAllStudents();
}
