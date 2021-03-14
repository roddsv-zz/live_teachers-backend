package com.rodrigo.liveteachers_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.liveteachers_back.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
