package com.rodrigo.liveteachers_back.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_classes")
public class Class implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String subject;
	private Double numberOfHours;
	private Instant moment;
	
	@ManyToMany
	@JoinTable(name = "tb_class_student_teacher_id", 
		joinColumns = @JoinColumn(name = "class_id"),
		inverseJoinColumns = @JoinColumn(name = "student_id"))
	private Set<Student> students = new HashSet<>();
	
	@ManyToMany
	@JoinTable(name = "tb_class_student_teacher_id", 
		joinColumns = @JoinColumn(name = "class_id"),
		inverseJoinColumns = @JoinColumn(name = "teacher_id"))
	private Set<Teacher> teachers = new HashSet<>();
	
	public Class() {
		
	}

	public Class(Long id, String subject, Double numberOfHours, Instant moment) {
		super();
		this.id = id;
		this.subject = subject;
		this.numberOfHours = numberOfHours;
		this.moment = moment;
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

	public Set<Student> getStudents() {
		return students;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Class other = (Class) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
