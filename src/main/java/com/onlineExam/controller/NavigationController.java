package com.onlineExam.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlineExam.entity.ScoreBoard;
import com.onlineExam.service.ScoreService;


@Controller
public class NavigationController {

	@Autowired
	ScoreService scoreService;

	@GetMapping("/")
	public String login() {
		return "login";
	}

	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(session.getAttribute("user") == null) {
			return "login";
		}
		return "home";
	}

	@GetMapping("/about")
	public String about(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(session.getAttribute("user") == null) {
			return "login";
		}
		return "about";
	}

	@RequestMapping("/registration")
	public ModelAndView showRegistration() {
		return new ModelAndView("registration");
	}

	@GetMapping("/scoreBoard")
	public ModelAndView viewScoreBoard(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(session.getAttribute("user") == null) {
			return new ModelAndView("login");
		}
		ModelAndView modelAndView = new ModelAndView();
		List<ScoreBoard> scores = scoreService.getAllScores();
		
		session.removeAttribute("questions");
		session.removeAttribute("qno");
		session.removeAttribute("score");
		session.removeAttribute("submittedDetails");
		
		modelAndView.setViewName("scoreBoard");
		modelAndView.addObject("scores", scores);
		return modelAndView;
	}
}
