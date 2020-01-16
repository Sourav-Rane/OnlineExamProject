package com.OnlineExam.deloitte.service;

import java.util.List;

import com.OnlineExam.deloitte.model.ExamUser;
import com.OnlineExam.deloitte.model.Question;
import com.OnlineExam.deloitte.model.Statistic;

public interface OnlineExamService {

	public List<Question> listQuestions(String category);

	public List<Question> listQuestions();

	public Question getQuestion(String question);
	
	public void deleteQuestion(String question);

	public List<Statistic> listUserStat(String email);
	
	public boolean checkUserExists(String email);
	
	public List<Statistic> listStatistics();
	
	public void addQuestion(Question question);

	public boolean addUser(ExamUser user);
	
	public ExamUser getUserDetail(String email);
	
	public void addStatistic(Statistic stats);
	
	

}
