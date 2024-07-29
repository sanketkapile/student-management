package com.sanket.student.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.student.dto.StudentDto;
import com.sanket.student.entity.Student;
import com.sanket.student.mapper.StudentMapper;
import com.sanket.student.repository.StudentRepository;
import com.sanket.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentRepository studentRepository;

	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public StudentDto createStudentInformation(StudentDto studentDto) {
		Student student = StudentMapper.mapToStudent(studentDto);
		Student savedInfo = studentRepository.save(student);
		return StudentMapper.mapToStudentDto2(savedInfo);
	}

	@Override
	public StudentDto getStudentById(Long id) {
		Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student Record Not Found"));
		return StudentMapper.mapToStudentDto2(student);
	}

	@Override
	public List<StudentDto> getAllAccounts() {
		List<Student> allStudents = studentRepository.findAll();
		return allStudents.stream()
				.map(student -> new StudentDto(student.getId(), student.getStudentName(),student.getStudyYear(), student.getIsStudent()))
				.collect(Collectors.toList());
	}

	@Override
	public void deleteAccount(Long id) {
		Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student Record Not Found"));
		studentRepository.delete(student);
	}

}
