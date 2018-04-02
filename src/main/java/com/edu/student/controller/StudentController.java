package com.edu.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.student.model.Student;
import com.edu.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/")
	public String hello() {
		
		return "Welcome to student info portal";
	}
	
	@PostMapping(value="/student")
	public Student saveStudent(@RequestBody Student student) {
		
		return studentService.saveStudent(student);
	}
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		
		return studentService.getAllStudent();
	}

}
