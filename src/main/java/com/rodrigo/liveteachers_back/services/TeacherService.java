package com.rodrigo.liveteachers_back.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodrigo.liveteachers_back.dto.TeacherDTO;
import com.rodrigo.liveteachers_back.entities.Teacher;
import com.rodrigo.liveteachers_back.repositories.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository repository;
	
	@Transactional(readOnly = true)
	public List<TeacherDTO> findAll() {
		List<Teacher> list = repository.findAll();
		return list.stream().map(x -> new TeacherDTO(x)).collect(Collectors.toList());
	}

}
