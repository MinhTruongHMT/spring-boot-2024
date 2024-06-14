package com.example.demo.service.impl;

import com.example.demo.entity.ClassRoom;
import com.example.demo.repository.ClassRepository;
import com.example.demo.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    @Autowired
    private ClassRepository classroomRepository;
    @Override
    public List<ClassRoom> getAllClassrooms() {
        return classroomRepository.findAll();
    }
    @Override
    public ClassRoom getClassroomById(Long id) {
        return classroomRepository.findById(id).orElse(null);
    }

    @Override
    public ClassRoom saveClassroom(ClassRoom classroom) {
        return null;

    }




    @Override
    public void deleteClassroom(Long id) {

    }
}
