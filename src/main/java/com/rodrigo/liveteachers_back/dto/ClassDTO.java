package com.rodrigo.liveteachers_back.dto;

import java.io.Serializable;
import java.time.Instant;

import com.rodrigo.liveteachers_back.entities.Class;

public class ClassDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String subject;
	private Double numberOfHours;
	private Instant moment;
	
	public ClassDTO() {
		
	}

	public ClassDTO(Long id, String subject, Double numberOfHours, Instant moment) {
		this.id = id;
		this.subject = subject;
		this.numberOfHours = numberOfHours;
		this.moment = moment;
	}
	
	public ClassDTO(Class entity) {
		id = entity.getId();
		subject = entity.getSubject();
		numberOfHours = entity.getNumberOfHours();
		moment = entity.getMoment();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(Double numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}
}