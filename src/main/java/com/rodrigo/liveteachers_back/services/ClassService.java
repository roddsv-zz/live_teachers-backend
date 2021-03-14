package com.rodrigo.liveteachers_back.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodrigo.liveteachers_back.dto.ClassDTO;
import com.rodrigo.liveteachers_back.dto.StudentDTO;
import com.rodrigo.liveteachers_back.dto.TeacherDTO;
import com.rodrigo.liveteachers_back.entities.Class;
import com.rodrigo.liveteachers_back.entities.Student;
import com.rodrigo.liveteachers_back.entities.Teacher;
import com.rodrigo.liveteachers_back.repositories.ClassRepository;
import com.rodrigo.liveteachers_back.repositories.StudentRepository;
import com.rodrigo.liveteachers_back.repositories.TeacherRepository;

@Service
public class ClassService {
	
	@Autowired
	private ClassRepository repository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;	
	
	@Transactional(readOnly = true)
	public List<ClassDTO> findAll() {
		List<Class> list = repository.findAll();
		return list.stream().map(x -> new ClassDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public ClassDTO insert(ClassDTO dto) {
		Class newClass = new Class(null, dto.getSubject(), dto.getNumberOfHours(), Instant.now());
		for (StudentDTO s : dto.getStudents()) {
			Student student = studentRepository.getOne(s.getId());
			newClass.getStudents().add(student);
		}
		for (TeacherDTO t : dto.getTeachers()) {
			Teacher teacher = teacherRepository.getOne(t.getId());
			newClass.getTeachers().add(teacher);
		}
		newClass = repository.save(newClass);
		
		return new ClassDTO(newClass);
	}
	

}
