package com.OnlineExam.deloitte.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineExam.deloitte.model.Question;
import com.OnlineExam.deloitte.model.Statistic;
import com.OnlineExam.deloitte.service.OnlineExamService;

@Controller
public class QuestionController {

	@Autowired
	OnlineExamService onlineExamService;

	// list out all qns based on a given category
	@RequestMapping("/admin_listQuestionCategoryWise")
	public ModelAndView viewQuestions(HttpServletRequest request) {
		System.out.println("Question Controller => viewQuestions ");
		String category = request.getParameter("category");
		ModelAndView view = new ModelAndView("Admin_allQuestion");
		List<Question> allQuestions = onlineExamService.listQuestions(category);
		view.addObject("flag", 1);
		view.addObject("allQuestions", allQuestions);
		return view;

	}

	@RequestMapping("/admin_question")
	public ModelAndView Questions() {
		System.out.println("Question Controller => Questions ");
		ModelAndView view = new ModelAndView("Admin_allQuestion");
		List<Question> allQns = null;
		view.addObject("flag", 0);
		view.addObject("allQuestions", allQns);
		return view;

	}

	@RequestMapping("/admin_deleteQuestion/{qn}")
	public ModelAndView deleteQuestion(@PathVariable("qn") String qn) {
		System.out.println("################# QUESTION CONTROLLER -> DELETEQUESTION ############### ");
		ModelAndView view = new ModelAndView("redirect:/admin_question");
		onlineExamService.deleteQuestion(qn);
		return view;
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
	
		
		view.addObject("allStats", set);
		return view;

	}

	@RequestMapping("/admin_addQuestion")

	public ModelAndView question() {
		ModelAndView view = new ModelAndView("Admin_addQuestion");
		view.addObject("question", new Question());
		return view;

	}

	@RequestMapping("/saveQuestion")

	public ModelAndView saveQuestion(Question question) {
		ModelAndView view = new ModelAndView("redirect:/admin_addQuestion");
		view.addObject("question", new Question());
		onlineExamService.addQuestion(question);
		System.out.println(question);
		return view;

	}

}
