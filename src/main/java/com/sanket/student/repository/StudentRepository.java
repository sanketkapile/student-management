package com.sanket.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
