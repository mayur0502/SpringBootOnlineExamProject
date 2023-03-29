package com.onlineExam.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineExam.entity.Student;
import com.onlineExam.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("GetStudent/{id}")
	public Student getStudent(@PathVariable UUID id) {
		Student student = studentService.getStudent(id);
		return student;
		
	}
	
	@GetMapping("getAllStudents")
	public List<Student> getStudent(){
		List<Student> student = studentService.getAllStudents();
		return student;
	}
	
	@PostMapping("addStudent")
	public String addStudent(@RequestBody Student student) {
		String result = studentService.addStudent(student);
		return result;
	}

	@PutMapping("updateStudent/{id}")
	public String updateStudent(@PathVariable UUID id,@RequestBody Student student) {
	String result = studentService.updateStudent(id, student);
		return "result";
	}
	
	@DeleteMapping("Delete/{id}")
	public String deleteStudent(@PathVariable UUID id) {
		
		String result = studentService.deleteStudent(id);
		return result;
	}

	}
