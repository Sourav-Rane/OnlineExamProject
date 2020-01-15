package com.OnlineExam.deloitte.service;

import java.util.List;

import com.OnlineExam.deloitte.model.Question;

public interface OnlineExamService {

	public List<Question> listQuestions(String category);

	public List<Question> listQuestions();

	public Question getQuestion(String question);
	
	public void deleteQuestion(String question);

}
