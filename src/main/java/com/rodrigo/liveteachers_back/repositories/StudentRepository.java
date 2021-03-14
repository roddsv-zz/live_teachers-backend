package com.rodrigo.liveteachers_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.liveteachers_back.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
