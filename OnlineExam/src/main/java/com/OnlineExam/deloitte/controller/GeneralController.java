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
public class GeneralController {
	
	@Autowired
	OnlineExamService onlineExamService;

	//list out all qns based on a given category
	@RequestMapping("/index")
	public String index() {
		return "index";
		
	}
	
	
}
















