package com.edu.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.student.model.Student;
import com.edu.student.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	public List<Student> getAllStudent() {

		return studentRepository.findAll();
	}
	
	
}
