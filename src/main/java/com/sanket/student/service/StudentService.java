package com.sanket.student.service;

import java.util.List;

import com.sanket.student.dto.StudentDto;

public interface StudentService {

	//Create Student
	StudentDto createStudentInformation(StudentDto studentDto);

	//Display Student Information
	StudentDto getStudentById(Long id);

	//Display account details
	List<StudentDto> getAllAccounts();

	//Delete Account
	void deleteAccount(Long id);
}
