package com.onlineExam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineExam.dao.QuestionDao;
import com.onlineExam.entity.Question;

@Service
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	QuestionDao questionDao;
	
	public List<Question> getAllQuestions() {
		List<Question> questions = questionDao.getAllQuestions();
		return questions;
	}

	public int getQuestionsCount() {
		return questionDao.getQuestionsCount();
	}

	@Override
	public Question getQuestion(int id) {
		Question question = questionDao.getQuestion(id);
		return question;
	}

	@Override
	public String addQuestion(Question question) {
		String result = questionDao.addQuestion(question);
		return result;
	}

	@Override
	public String updateQuestion(int id, Question question) {
		Question dbQuestion = questionDao.getQuestion(id);

		if (dbQuestion != null) {
			dbQuestion = question;

			String result = questionDao.updateQuestion(dbQuestion);
			return result;

		} else {
			return "Question doesnot exist";
		}
	}

	@Override
	public String deleteQuestion(int id) {
		String result = questionDao.deleteQuestion(id);
		return result;
	}

}
