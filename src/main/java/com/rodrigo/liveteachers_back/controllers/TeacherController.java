package com.rodrigo.liveteachers_back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.liveteachers_back.dto.TeacherDTO;
import com.rodrigo.liveteachers_back.services.TeacherService;

@RestController
@RequestMapping(value = "/teachers")
public class TeacherController {
	
	@Autowired
	private TeacherService service;
	
	@GetMapping
	public ResponseEntity<List<TeacherDTO>> findAll(){
		List<TeacherDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
