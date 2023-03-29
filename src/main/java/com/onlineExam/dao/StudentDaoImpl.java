package com.onlineExam.dao;

import java.util.List;
import java.util.UUID;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onlineExam.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Student getStudent(UUID id) {
		// TODO Auto-generated method stub
		Session session  =sessionFactory.openSession();
		Student student = session.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		Session session = sessionFactory.openSession();
				Criteria criteria = session.createCriteria(Student.class);
				List<Student> student = criteria.list();
				return student;
		
		
	}

	@Override
	public String addStudent(Student student) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.save(student);
		session.beginTransaction().commit();
		return "Student Added";
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.update(student);
		session.beginTransaction().commit();
			return "Student updated";
	}

	@Override
	public String deleteStudent(UUID id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Student student = session.get(Student.class, id);
		if(student != null) {
		session.delete(student);
		session.beginTransaction().commit();
		return "Record Deleted";
		}
		return "Record Not Found";
	}
	
	@Override
	public String fetchPassword(String username) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("select password from Student where username = '"+username+"'");
		List<String> data = query.list();
		if(data.isEmpty()) {
			return null;
		}
		return data.get(0);
	}

	@Override
	public Student getStudentByUsername(String username) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Student where username = '"+username+"'");
		List<Student> student = query.list();
		if(student.isEmpty()) {
			return null;
		}
		return student.get(0);
	}

}
