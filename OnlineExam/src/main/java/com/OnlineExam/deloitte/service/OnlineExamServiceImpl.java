package com.OnlineExam.deloitte.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineExam.deloitte.dao.OnlineExamQuestionDAO;
import com.OnlineExam.deloitte.dao.OnlineExamStatisticDAO;
import com.OnlineExam.deloitte.dao.OnlineExamUserDAO;
import com.OnlineExam.deloitte.model.ExamUser;
import com.OnlineExam.deloitte.model.Question;
import com.OnlineExam.deloitte.model.Statistic;

@Service
public class OnlineExamServiceImpl implements OnlineExamService {

	@Autowired
	OnlineExamQuestionDAO onlineExamQuestionDAO;

	@Autowired
	OnlineExamStatisticDAO onlineExamStatisticDAO;

	@Autowired
	OnlineExamUserDAO onlineExamUserDAO;

	@Override
	@Transactional
	public List<Question> listQuestions(String category) {
		return onlineExamQuestionDAO.findByQuestionCategory(category);
	}

	@Override
	@Transactional
	public List<Question> listQuestions() {
		return (List<Question>) onlineExamQuestionDAO.findAll();
	}

	@Override
	@Transactional
	public Question getQuestion(String question) {
		Optional<Question> optionalProduct = onlineExamQuestionDAO.findById(question);
		Question qn = new Question();
		if (optionalProduct.isPresent()) {
			qn = optionalProduct.get();
		}
		return qn;

	}

	@Override
	@Transactional
	public void deleteQuestion(String question) {
		System.out.println("DELETING.....");
		onlineExamQuestionDAO.deleteById(question);
		System.out.println("DELETED.....");
	}

	@Override
	@Transactional
	public List<Statistic> listUserStat(String email) {
		return onlineExamStatisticDAO.findByStatEmail(email);
	}

	@Override
	@Transactional
	public boolean checkUserExists(String email) {
		return onlineExamUserDAO.existsById(email);
	}

	@Override
	@Transactional
	public List<Statistic> listStatistics() {
		return (List<Statistic>) onlineExamStatisticDAO.findAll();
	}

	@Override
	@Transactional
	public void addQuestion(Question question) {
		onlineExamQuestionDAO.save(question);
	}

	@Override
	@Transactional
	public boolean addUser(ExamUser user) {
		if(!onlineExamUserDAO.existsById(user.getUserEmail()))
			{
				 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				onlineExamUserDAO.save(user);
				return true;
			}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		return false;
	}

	@Override
	@Transactional
	public ExamUser getUserDetail(String email) {
		Optional<ExamUser> optionalUser=onlineExamUserDAO.findById(email);
		ExamUser user =new ExamUser();
		if(optionalUser.isPresent())
		{
			user=optionalUser.get();
		}
		return user;
	}
}
