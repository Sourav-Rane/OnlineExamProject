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
public class UserController {
	
	
	@Autowired
	OnlineExamService onlineExamService;
	
	
	@RequestMapping("/select_TestCategory")
	public ModelAndView selectTestCategory() {
		System.out.println("######### USER CONTROLLER => SELECT TEST CATEGORY ########## ");
		ModelAndView view = new ModelAndView("User_Welcome");
		return view;
	}
	
	@RequestMapping("/beginTest")
	public ModelAndView beingTest(HttpServletRequest request) {
		System.out.println("######### USER CONTROLLER => BEGIN TEST ##########  ");
		String category = request.getParameter("category");
		ModelAndView view = new ModelAndView("redirect:/user_StartTest/"+category);
		return view;
		
	}	
	
	
	
	@RequestMapping("/user_StartTest/{cat}")
	public ModelAndView startTest(@PathVariable("cat")String category) {
		System.out.println("######### USER CONTROLLER => START TEST ########## ");
		ModelAndView view = new ModelAndView("User_giveTest");
		List<Question> allQuestions = onlineExamService.listQuestions(category);
		view.addObject("allQuestions", allQuestions);
		return view;
	}
	
	
	@RequestMapping("/user_StartTest/user_SubmitTest")
	public ModelAndView submitTest(HttpServletRequest request) {
		System.out.println("######### USER CONTROLLER => SUBMIT TEST ########## ");
		ModelAndView view = new ModelAndView("User_TestResult");
		Enumeration<String> paramNames = request.getParameterNames();
		int score = 0;
		int total = 0;
		while(paramNames.hasMoreElements()) {
		    String user_answer = request.getParameter((String)paramNames.nextElement());
		    String correct_answer = request.getParameter((String)paramNames.nextElement());
		    
		    System.out.println("#####################");
		    System.out.println(correct_answer);
		    System.out.println(user_answer);
		    System.out.println(score+" "+total);
		    System.out.println("#####################");
		    
		    if(user_answer.contentEquals(correct_answer))
		    	score++;
		    total++;
		}
		view.addObject("finalScore", Integer.parseInt(""+(score*100/total)));
		return view;
	}
	
	
	@RequestMapping("/user_ViewStat/{email}")
	public ModelAndView viewStat(@PathVariable("email")String email) {
		System.out.println("######### USER CONTROLLER => VIEW STAT SOLO ##########  ");
		ModelAndView view = new ModelAndView("User_ViewStat");
		List<Statistic> userStat = onlineExamService.listUserStat(email);
		view.addObject("userStat", userStat);		
		return view;
		
	}	
	
	

}
