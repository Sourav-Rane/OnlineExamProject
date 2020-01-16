package com.OnlineExam.deloitte.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineExam.deloitte.model.ExamUser;
import com.OnlineExam.deloitte.service.OnlineExamService;


@Controller
public class GeneralController {
	
	@Autowired
	OnlineExamService onlineExamService;

	//list out all qns based on a given category
	@RequestMapping("/index")
	public String index() {
		return "Welcome";
		
	}
	

	@RequestMapping("/user_login")
	public ModelAndView userLogIn() {
		System.out.println("######### USER CONTROLLER => USER LOGIN PAGE ########## ");
		ModelAndView view = new ModelAndView("User_Login");
		view.addObject("error", 0);
		return view;
	}
	
	
	@RequestMapping("/checkUser")
	public ModelAndView checkUser(HttpServletRequest request) {
		System.out.println("######### USER CONTROLLER => USER LOGIN PAGE ########## ");
		String email = request.getParameter("userEmail");
		boolean result = onlineExamService.checkUserExists(email);
		ExamUser user = onlineExamService.getUserDetail(email);
		
		HttpSession session = request.getSession();
		session.setAttribute("useremail", user.getUserEmail());
		session.setAttribute("username", user.getUserName());
		
		ModelAndView view = new ModelAndView();
		if(result)
		{
			view.setViewName("User_Welcome");
		}
		else {
			view.setViewName("User_Login");
			view.addObject("error", 1);
		}
		
		return view;
	}
	
	@RequestMapping("/user_welcome")
	public String welcomeUser() {
		return "User_Welcome";
	}
	
	@RequestMapping("/user_signup")
	public ModelAndView userSignUp() {
		System.out.println("######### USER CONTROLLER => USER SIGNUP PAGE ########## ");
		ModelAndView view = new ModelAndView("User_SignUp");
		view.addObject("confirm", 0);
		return view;
	}
	

	
	@RequestMapping("/user_saveExamUser")
	public ModelAndView saveExamUser(ExamUser user) {
		System.out.println("######### USER CONTROLLER => SAVING USER IN DATABASE ########## ");
		ModelAndView view = new ModelAndView("redirect:/user_signup");
		boolean result = onlineExamService.addUser(user);
		if(result) {
			System.out.println("SAVEEED SUCCESFULLYYYY.................");
			view.addObject("error",0);
		}else {
			System.out.println("DUPLICATE.......................");
			view.addObject("error",1);
		}
		return view;
	}
	
	
}
















