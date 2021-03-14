package com.rodrigo.liveteachers_back.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodrigo.liveteachers_back.dto.ClassDTO;
import com.rodrigo.liveteachers_back.entities.Class;
import com.rodrigo.liveteachers_back.repositories.ClassRepository;

@Service
public class ClassService {
	
	@Autowired
	private ClassRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClassDTO> findAll() {
		List<Class> list = repository.findAll();
		return list.stream().map(x -> new ClassDTO(x)).collect(Collectors.toList());
	}

}
