package com.onlineExam.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class ScoreBoard {

	@Id
	@Type(type = "uuid-char")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Type(type = "uuid-char")
	private UUID studentId;
	private String studentName;
	private int score;

	public ScoreBoard() {
		super();
	}

	public ScoreBoard(UUID id, UUID studentId, String studentName, int score) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.studentName = studentName;
		this.score = score;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getStudentId() {
		return studentId;
	}

	public void setStudentId(UUID studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "ScoreBoard [id=" + id + ", studentId=" + studentId + ", studentName=" + studentName + ", score=" + score
				+ "]";
	}

}

