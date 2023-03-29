package com.onlineExam.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlineExam.entity.Student;
import com.onlineExam.model.User;
import com.onlineExam.service.QuestionService;
import com.onlineExam.service.StudentService;


@Controller
public class LoginController {

	@Autowired
	StudentService studentService;

	@Autowired
	QuestionService questionService;

	@PostMapping("/login")
	public ModelAndView login(User user, HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();

		if (studentService.validateUser(user)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			modelAndView.setViewName("home");
			modelAndView.addObject("welcome", "Welcome to online examination " + user.getUsername());
		} else {
			modelAndView.setViewName("login");
			modelAndView.addObject("error", "Invalid username/password");
		}

		return modelAndView;	

	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return new ModelAndView("login");
	}
	
	@RequestMapping("/addStudent")
	public ModelAndView add(Student student) throws Exception {
		studentService.addStudent(student);
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("login");
		modelAndView.addObject("success", "Registration successful.please login");

		return modelAndView;
	}
}
