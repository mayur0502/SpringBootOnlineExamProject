package com.onlineExam.model;

public class Answer {

	public int qno;
	public String submittedAnswer;
	public String originalAnswer;
	public String questionText;

	Answer() {
	}

	public Answer(int qno, String submittedAnswer, String originalAnswer, String questionText) {
		super();
		this.qno = qno;
		this.submittedAnswer = submittedAnswer;
		this.originalAnswer = originalAnswer;
		this.questionText = questionText;

	}

	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
	}

	public String getSubmittedAnswer() {
		return submittedAnswer;
	}

	public void setSubmittedAnswer(String submittedAnswer) {
		this.submittedAnswer = submittedAnswer;
	}

	public String getOriginalAnswer() {
		return originalAnswer;
	}

	public void setOriginalAnswer(String originalAnswer) {
		this.originalAnswer = originalAnswer;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	
}
