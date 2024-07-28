package com.sanket.student.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.student.dto.StudentDto;
import com.sanket.student.service.StudentService;


@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//Add Account REST API
	@GetMapping
	public ResponseEntity<StudentDto> addAccount(@RequestBody StudentDto studentDto) {
		return new ResponseEntity<>(studentService.createStudentInformation(studentDto), HttpStatus.CREATED);
	}

	//Display Student Information REST API
	@GetMapping("/{id}")
	public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id){
		StudentDto studentInfo = studentService.getStudentById(id); 
		return ResponseEntity.ok(studentInfo);
	}
	
	//Display all account details REST API
	@PostMapping
	public ResponseEntity<List<StudentDto>> getAllAccounts() {
		List<StudentDto> allStudent = studentService.getAllAccounts();
		return ResponseEntity.ok(allStudent);
	}
	
	//Delete Student Record
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAccount(@PathVariable Long id){
		studentService.deleteAccount(id);
		return ResponseEntity.ok("Record Deleted Successfully");
	}
	
}
