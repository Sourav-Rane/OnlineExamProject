package com.OnlineExam.deloitte.controller;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineExam.deloitte.model.ExamUser;
import com.OnlineExam.deloitte.model.Question;
import com.OnlineExam.deloitte.model.Statistic;
import com.OnlineExam.deloitte.service.OnlineExamService;

@Controller
public class AdminController {
	
	
	@Autowired
	OnlineExamService onlineExamService;
	
	@RequestMapping("/admin")
	public String adminPage() {
		return "Admin_Login";
	}
	
	
	@RequestMapping("/admin_welcome")
	public String adminLogin() {
		return "Admin_Welcome";
	}

	
	@RequestMapping("/admin_addquestion")
	public String adminAddQuestion() {
		return "Admin_addQuestion";
	}
	
	@RequestMapping("/admin_viewquestion")
	public String adminViewQuestion() {
		return "Admin_allQuestion";
	}
	

	@RequestMapping("/admin_viewusers")
	public String adminViewUsers() {
		return "Admin_allUserDetails";
	}
	
	
}
