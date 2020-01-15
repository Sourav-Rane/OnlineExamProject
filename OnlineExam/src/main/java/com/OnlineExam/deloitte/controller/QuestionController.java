package com.OnlineExam.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineExam.deloitte.model.Question;
import com.OnlineExam.deloitte.service.OnlineExamService;


@Controller
public class QuestionController {
	
	@Autowired
	OnlineExamService onlineExamService;

	//list out all qns based on a given category
	@RequestMapping("/admin_listQuestionCategoryWise")
	public ModelAndView viewQuestions(HttpServletRequest request) {
		System.out.println("Question Controller => viewQuestions ");
		String category = request.getParameter("category");
		ModelAndView view = new ModelAndView("Admin_allQuestion");
		List<Question> allQuestions = onlineExamService.listQuestions(category);
		view.addObject("flag",1);
		view.addObject("allQuestions", allQuestions);
		return view;
		
	}
	
	
	@RequestMapping("/admin_question")
	public ModelAndView Questions() {
		System.out.println("Question Controller => Questions ");
		ModelAndView view = new ModelAndView("Admin_allQuestion");
		List<Question> allQns = null;
		view.addObject("flag",0);
		view.addObject("allQuestions",allQns);
		return view;
		
	}
	
	@RequestMapping("/admin_deleteQuestion/{qn}")
	public ModelAndView deleteQuestion(@PathVariable("qn")String qn) {
		System.out.println("################# QUESTION CONTROLLER -> DELETEQUESTION ############### ");
		ModelAndView view = new ModelAndView("redirect:/admin_question");
		onlineExamService.deleteQuestion(qn);
		return view;
	}
	
	
}
















