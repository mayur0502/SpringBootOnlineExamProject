package com.onlineExam.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineExam.dao.StudentDao;
import com.onlineExam.entity.Student;
import com.onlineExam.model.User;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override
 	public Student getStudent(UUID id) {
		Student student = studentDao.getStudent(id);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = studentDao.getAllStudents();
		return students;
	}

	@Override
	public String addStudent(Student student) {
		String result = studentDao.addStudent(student);
		return result;
	}

	@Override
	public String updateStudent(UUID id, Student student) {
		Student student2 = studentDao.getStudent(id);
		
		if (student2 != null) {
			student2 = student;
			
			String result = studentDao.updateStudent(student2);
			return result;
			
		} else {
			return "Student doesnot exist";
		}
	}

	@Override
	public String deleteStudent(UUID id) {
		String result = studentDao.deleteStudent(id);
		return result;
	}

	public boolean validateUser(User user) {
		String dbPassword = studentDao.fetchPassword(user.getUsername());
		
		if(dbPassword != null && dbPassword.equals(user.getPassword())) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Student getStudentByUsername(String username) {
		return studentDao.getStudentByUsername(username);
	}
}
