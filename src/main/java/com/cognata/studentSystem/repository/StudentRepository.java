package com.cognata.studentSystem.repository;

import com.cognata.studentSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
