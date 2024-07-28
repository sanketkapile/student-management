package com.sanket.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_information_Backup")
public class StudentBackup {
	
	@Id
	@Column(name="roll_no")
	private Long id;
	@Column(name="student_name")
	private String studentName;
	@Column(name="study_year")
	private Integer studyYear;
	@Column(name="isStudent")
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
	
	public StudentBackup(Long id, String studentName, Integer studyYear, String isStudent) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studyYear = studyYear;
		this.isStudent = isStudent;
	}
	
	public StudentBackup() {
		super();
	}
}
