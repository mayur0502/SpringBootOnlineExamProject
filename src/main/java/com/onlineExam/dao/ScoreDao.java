package com.onlineExam.dao;

import java.util.List;
import java.util.UUID;

import com.onlineExam.entity.ScoreBoard;

public interface ScoreDao {

	List<ScoreBoard> getScoresByStudentId(UUID studentId);

	List<ScoreBoard> getAllScores();

	String addScore(ScoreBoard scoreBoard);

	String deleteScore(UUID id);
}
