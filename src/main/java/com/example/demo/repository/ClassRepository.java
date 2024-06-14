package com.example.demo.repository;

import com.example.demo.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ClassRepository extends JpaRepository<ClassRoom, Long> {
}
