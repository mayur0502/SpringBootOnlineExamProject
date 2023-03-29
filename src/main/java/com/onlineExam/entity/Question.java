package com.onlineExam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question{

	@Id
	public int qNumber;
	public String qText;
	public String qAnswer;
	public String option1;
	public String option2;
	public String option3;

	public Question() {
		super();
	}

	public Question(int qNumber, String qText, String qAnswer, String option1, String option2, String option3) {
		super();
		this.qNumber = qNumber;
		this.qText = qText;
		this.qAnswer = qAnswer;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
	}

	public int getqNumber() {
		return qNumber;
	}

	public void setqNumber(int qNumber) {
		this.qNumber = qNumber;
	}

	public String getqText() {
		return qText;
	}

	public void setqText(String qText) {
		this.qText = qText;
	}

	public String getqAnswer() {
		return qAnswer;
	}

	public void setqAnswer(String qAnswer) {
		this.qAnswer = qAnswer;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	@Override
	public String toString() {
		return "Question [qNumber=" + qNumber + ", qText=" + qText + ", qAnswer=" + qAnswer + ", option1=" + option1
				+ ", option2=" + option2 + ", option3=" + option3 + "]";
	}

}
