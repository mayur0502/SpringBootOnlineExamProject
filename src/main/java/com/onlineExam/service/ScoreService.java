package com.onlineExam.service;

import java.util.List;
import java.util.UUID;

import com.onlineExam.entity.ScoreBoard;

public interface ScoreService {

	List<ScoreBoard> getScoresByStudentId(UUID studentId);

	List<ScoreBoard> getAllScores();

	String addScore(String username, int score);

	String deleteScore(UUID id);
}
