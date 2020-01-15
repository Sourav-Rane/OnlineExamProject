package com.OnlineExam.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineExam.deloitte.dao.OnlineExamDAO;
import com.OnlineExam.deloitte.model.Question;

@Service
public class OnlineExamServiceImpl implements OnlineExamService {
	
	@Autowired
	OnlineExamDAO onlineExamDAO;

	@Override
	public List<Question> listQuestions(String category) {
		return onlineExamDAO.findByQuestionCategory(category);
	}

	@Override
	public List<Question> listQuestions() {
		return (List<Question>) onlineExamDAO.findAll();
	}

	@Override
	public Question getQuestion(String question) {
		Optional<Question> optionalProduct = onlineExamDAO.findById(question);
		Question qn = new Question();
		if(optionalProduct.isPresent())
		{
			qn = optionalProduct.get();
		}
		return qn;
		
	}

	@Override
	public void deleteQuestion(String question) {
		onlineExamDAO.deleteById(question);
	}
}
