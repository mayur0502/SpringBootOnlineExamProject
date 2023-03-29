package com.onlineExam.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onlineExam.entity.Question;

@Repository
public class QuestionDaoImpl implements QuestionDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Question> getAllQuestions() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Question.class);

		List<Question> questions = criteria.list();
		return questions;
	}

	@Override
	public Question getQuestion(int id) {
		Session session = sessionFactory.openSession();
		Question question = session.get(Question.class, id);
		return question;
	}

	@Override
	public String addQuestion(Question question) {
		Session session = sessionFactory.openSession();
		session.save(question);
		session.beginTransaction().commit();

		return "Question added";
	}

	@Override
	public String updateQuestion(Question question) {
		Session session = sessionFactory.openSession();
		session.update(question);
		session.beginTransaction().commit();
		return "Question updated";
	}

	@Override
	public String deleteQuestion(int id) {
		Session session = sessionFactory.openSession();
		Question question = session.get(Question.class, id);

		if (question != null) {
			session.delete(question);
			session.beginTransaction().commit();
			return "Question deleted";
		} else {
			return "Question doesnot exist";
		}
	}
	
	public int getQuestionsCount() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Question.class);
		criteria.setProjection(Projections.rowCount());
		long count = (long) criteria.uniqueResult();
		return (int)count;	
		
	}

}
