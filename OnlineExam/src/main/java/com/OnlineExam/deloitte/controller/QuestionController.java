package com.OnlineExam.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineExam.deloitte.model.Question;


@Controller
public class QuestionController {

	@RequestMapping("/listQuestion")
	public ModelAndView viewQuestion() {
		System.out.println("Question Controller => viewQuestion ");
		ModelAndView view = new ModelAndView("allQuestions");
		view.addObject("command",new Question());
	
		return view;
		
	}
	
}
