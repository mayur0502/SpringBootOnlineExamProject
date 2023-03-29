package com.onlineExam.service;

import java.util.List;
import java.util.UUID;

import com.onlineExam.entity.Student;
import com.onlineExam.model.User;

public interface StudentService {

	Student getStudent(UUID id);

	List<Student> getAllStudents();

	String addStudent(Student student);

	String updateStudent(UUID id, Student student);

	String deleteStudent(UUID id);
	
	boolean validateUser(User user);
	
	Student getStudentByUsername(String username);
}
