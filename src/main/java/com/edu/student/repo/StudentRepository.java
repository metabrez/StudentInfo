package com.edu.student.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	//Student save(Student student);
	public void findByName(String name);
	public void findByAge(int age);
	List<Student> findAll();
	
}
