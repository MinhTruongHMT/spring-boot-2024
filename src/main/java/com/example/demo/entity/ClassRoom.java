package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "classes")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long classId;
    @Column
    private String ClassName;
    @Column
    private String teacherName;

    @OneToMany(mappedBy = "classRoom", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Student> students;

    // Constructors
    public ClassRoom() {}

    public ClassRoom(Long classId, String className, String teacherName, Set<Student> students) {
        this.classId = classId;
        ClassName = className;
        this.teacherName = teacherName;
        this.students = students;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classId=" + classId +
                ", ClassName='" + ClassName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
