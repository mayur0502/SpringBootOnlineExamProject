package com.onlineExam.service;

import java.util.List;

import com.onlineExam.entity.Question;


public interface QuestionService {

	public List<Question> getAllQuestions();

	public Question getQuestion(int id);

	public String addQuestion(Question question);

	public String updateQuestion(int id, Question question);

	public String deleteQuestion(int id);
	
	public int getQuestionsCount();

}
