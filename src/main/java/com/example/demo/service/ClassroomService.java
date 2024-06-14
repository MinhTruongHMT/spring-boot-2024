package com.example.demo.service;

import com.example.demo.entity.ClassRoom;

import java.util.List;
import java.util.Optional;

public interface ClassroomService {
    List<ClassRoom> getAllClassrooms();
    ClassRoom getClassroomById(Long id);
    ClassRoom saveClassroom(ClassRoom classroom);
    void deleteClassroom(Long id);
}
