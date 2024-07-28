package com.sanket.student.mapper;

import com.sanket.student.dto.StudentDto;
import com.sanket.student.entity.Student;

public class StudentMapper {
	
	public static Student mapToStudent(StudentDto studentDto) {
		Student student = new Student(
				studentDto.getId(),
				studentDto.getStudentName(),
				studentDto.getStudyYear(),
				studentDto.getIsStudent()
				);
		
		return student;
	}
	
	public static Student mapToStudent2(StudentDto studentDto) {
		
		Student student = new Student();
		student.setId(studentDto.getId());
		student.setStudentName(studentDto.getStudentName());
		student.setStudyYear(studentDto.getStudyYear());
		student.setIsStudent(studentDto.getIsStudent());
		return student;
	}
	
	public static StudentDto mapToStudentDto(Student student) {
		
		StudentDto studentDto = new StudentDto(
				student.getId(),
				student.getStudentName(),
				student.getStudyYear(),
				student.getIsStudent()
				);
		
		return studentDto;
	}
	
	public static StudentDto mapToStudentDto2(Student student) {
		StudentDto studentDto = new StudentDto();
		studentDto.setId(student.getId());
		studentDto.setStudentName(student.getStudentName());
		studentDto.setStudyYear(student.getStudyYear());
		studentDto.setIsStudent(student.getIsStudent());
		return studentDto;
	}
}
