package com.sanket.student.dto;

import javax.persistence.Column;

public class StudentDto {

	private Long id;
	private String studentName;
	private Integer studyYear;
	private String isStudent;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudyYear() {
		return studyYear;
	}
	public void setStudyYear(Integer studyYear) {
		this.studyYear = studyYear;
	}
	public String getIsStudent() {
		return isStudent;
	}
	public void setIsStudent(String isStudent) {
		this.isStudent = isStudent;
	}
	
	public StudentDto(Long id, String studentName, Integer studyYear, String isStudent) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studyYear = studyYear;
		this.isStudent = isStudent;
	}
	
	public StudentDto() {
		super();
	}
	
}
