package com.example.demo.controller;

import com.example.demo.entity.ClassRoom;
import com.example.demo.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classrooms")
public class ClassroomController {
    @Autowired
    private ClassroomService classroomService;

    @GetMapping
    public List<ClassRoom> getAllClassrooms() {
        return classroomService.getAllClassrooms();
    }

    @GetMapping("/{id}")
    public ClassRoom getClassroomById(@PathVariable Long id) {

        return classroomService.getClassroomById(id);
    }

    @PostMapping
    public ClassRoom createClassroom(@RequestBody ClassRoom classroom) {
        return classroomService.saveClassroom(classroom);
    }


    @DeleteMapping("/{id}")
    public void deleteClassroom(@PathVariable Long id) {
        classroomService.deleteClassroom(id);
    }
}
