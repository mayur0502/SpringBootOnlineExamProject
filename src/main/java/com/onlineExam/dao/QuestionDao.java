package com.onlineExam.dao;

import java.util.List;

import com.onlineExam.entity.Question;

public interface QuestionDao {

	public List<Question> getAllQuestions();

	public Question getQuestion(int id);

	public String addQuestion(Question question);

	public String updateQuestion(Question question);

	public String deleteQuestion(int id);
	
	public int getQuestionsCount();	
}
