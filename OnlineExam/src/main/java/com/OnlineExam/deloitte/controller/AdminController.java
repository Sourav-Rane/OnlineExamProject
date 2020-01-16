package com.OnlineExam.deloitte.controller;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	// to populate the drop down with useremails
		@RequestMapping("/admin_retrieveUser")
		public ModelAndView retrieveUser() {
			System.out.println("################# QUESTION CONTROLLER -> RETRIVE EMAIL USERS ############### ");
			ModelAndView view = new ModelAndView("Admin_allUserDetails");
			List<Statistic> allStats = onlineExamService.listStatistics();
			Set<String> set = new HashSet<>();
			for(Statistic s: allStats)
				set.add(s.getStatEmail());
			view.addObject("flagx", 0);
			view.addObject("userStat", null);
			view.addObject("allIds", set);
			return view;

		}
		
		/* ########################################################### */
		@RequestMapping("/admin_retrieveUserData")
		public ModelAndView viewStat(HttpServletRequest request) {
			System.out.println("######### USER CONTROLLER => VIEW STAT SOLO ##########  ");
			ModelAndView view = new ModelAndView("Admin_allUserDetails");
			String email = request.getParameter("email");
			List<Statistic> userStat = onlineExamService.listUserStat(email);
			List<Statistic> allStats = onlineExamService.listStatistics();
			Set<String> set = new HashSet<>();
			for(Statistic s: allStats)
				set.add(s.getStatEmail());
			view.addObject("flagx", 1);
			view.addObject("userStat", userStat);
			view.addObject("allIds", set);
			return view;
			
		}	

}
