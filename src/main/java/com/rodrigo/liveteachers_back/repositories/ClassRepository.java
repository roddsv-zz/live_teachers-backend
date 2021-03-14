package com.rodrigo.liveteachers_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.liveteachers_back.entities.Class;

public interface ClassRepository extends JpaRepository<Class, Long> {

}
