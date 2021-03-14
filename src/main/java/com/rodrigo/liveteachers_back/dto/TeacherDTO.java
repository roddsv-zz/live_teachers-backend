package com.rodrigo.liveteachers_back.dto;

import java.io.Serializable;

import com.rodrigo.liveteachers_back.entities.Teacher;

public class TeacherDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String subject;
	private String description;
	private Double hourPrice;
	private String imageUri;
	
	public TeacherDTO() {
		
	}

	public TeacherDTO(Long id, String name, String subject, String description, Double hourPrice, String imageUri) {
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.description = description;
		this.hourPrice = hourPrice;
		this.imageUri = imageUri;
	}
	
	public TeacherDTO(Teacher entity) {
		id = entity.getId();
		name = entity.getName();
		subject = entity.getSubject();
		description = entity.getDescription();
		hourPrice = entity.getHourPrice();
		imageUri = entity.getImageUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getHourPrice() {
		return hourPrice;
	}

	public void setHourPrice(Double hourPrice) {
		this.hourPrice = hourPrice;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
}
