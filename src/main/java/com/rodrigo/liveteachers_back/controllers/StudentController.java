package com.rodrigo.liveteachers_back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.liveteachers_back.dto.StudentDTO;
import com.rodrigo.liveteachers_back.services.StudentService;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping
	public ResponseEntity<List<StudentDTO>> findAll(){
		List<StudentDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
