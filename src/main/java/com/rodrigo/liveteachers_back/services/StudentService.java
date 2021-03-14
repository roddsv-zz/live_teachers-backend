package com.rodrigo.liveteachers_back.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodrigo.liveteachers_back.dto.StudentDTO;
import com.rodrigo.liveteachers_back.entities.Student;
import com.rodrigo.liveteachers_back.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	@Transactional(readOnly = true)
	public List<StudentDTO> findAll() {
		List<Student> list = repository.findAll();
		return list.stream().map(x -> new StudentDTO(x)).collect(Collectors.toList());
	}
}
