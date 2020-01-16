package com.OnlineExam.deloitte.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
		ModelAndView view = new ModelAndView();
		if(result)
		{
			view.setViewName("Welcome");
		}
		else {
			view.setViewName("User_Login");
			view.addObject("error", 1);
		}
		
		return view;
	}
}
















