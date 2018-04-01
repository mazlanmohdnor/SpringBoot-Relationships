package com.mazlan.relationship.demo.repositories;

import com.mazlan.relationship.demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
