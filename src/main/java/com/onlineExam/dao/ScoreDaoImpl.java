package com.onlineExam.dao;

import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.onlineExam.entity.ScoreBoard;

@Repository
public class ScoreDaoImpl implements ScoreDao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<ScoreBoard> getScoresByStudentId(UUID studentId) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from ScoreBoard where studentId = '"+studentId+"'");
		List<ScoreBoard> scores = query.list();
		return scores;
	}

	@Override
	public List<ScoreBoard> getAllScores() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(ScoreBoard.class);
		criteria.addOrder(Order.desc("score"));
		List<ScoreBoard> scores = criteria.list();
		return scores;
	}

	@Override
	public String addScore(ScoreBoard scoreBoard) {
		Session session = sessionFactory.openSession();
		session.save(scoreBoard);
		session.beginTransaction().commit();

		return "Score added";
	}

	@Override
	public String deleteScore(UUID id) {
		Session session = sessionFactory.openSession();
		ScoreBoard scoreBoard = session.get(ScoreBoard.class, id);

		if (scoreBoard != null) {
			session.delete(scoreBoard);
			session.beginTransaction().commit();
			return "Score deleted";
		} else {
			return "Record doesnot exist";
		}
	}


}
