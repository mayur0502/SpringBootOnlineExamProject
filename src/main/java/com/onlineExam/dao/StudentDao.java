package com.onlineExam.dao;

import java.util.List;
import java.util.UUID;

import com.onlineExam.entity.Student;

public interface StudentDao {

	Student getStudent(UUID id);
	List<Student> getAllStudents();

	String addStudent(Student student);

	String updateStudent(Student student);

	String deleteStudent(UUID id);
	
	String fetchPassword(String username);
	
	Student getStudentByUsername(String username);
}
