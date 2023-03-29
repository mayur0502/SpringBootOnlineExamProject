package com.onlineExam.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineExam.dao.ScoreDao;
import com.onlineExam.entity.ScoreBoard;
import com.onlineExam.entity.Student;

@Service
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	ScoreDao scoreDao;
	
	@Autowired 
	StudentService studentService;

	@Override
	public List<ScoreBoard> getScoresByStudentId(UUID studentId) {		
		return scoreDao.getScoresByStudentId(studentId);
	}

	@Override
	public List<ScoreBoard> getAllScores() {
		return scoreDao.getAllScores();
	}

	@Override
	public String addScore(String username, int score) {
		Student student = studentService.getStudentByUsername(username);
		ScoreBoard scoreBoard = new ScoreBoard();
		scoreBoard.setStudentId(student.getId());
		scoreBoard.setStudentName(student.getFirstName()+" "+student.getLastName());
		scoreBoard.setScore(score);
		return scoreDao.addScore(scoreBoard);
	}

	@Override
	public String deleteScore(UUID id) {
		return scoreDao.deleteScore(id);
	}


}
