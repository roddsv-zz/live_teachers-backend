package com.rodrigo.liveteachers_back.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.liveteachers_back.dto.ClassDTO;
import com.rodrigo.liveteachers_back.services.ClassService;


@RestController
@RequestMapping(value = "/classes")
public class ClassController {
	
	@Autowired
	private ClassService service;
	
	@GetMapping
	public ResponseEntity<List<ClassDTO>> findAll(){
		List<ClassDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
