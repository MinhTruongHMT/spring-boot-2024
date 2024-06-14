package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(int id);
    Student saveStudent(Student student);
    void deleteStudent(int id);
}
