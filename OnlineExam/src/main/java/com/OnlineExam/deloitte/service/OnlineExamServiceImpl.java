package com.OnlineExam.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineExam.deloitte.dao.OnlineExamQuestionDAO;
import com.OnlineExam.deloitte.dao.OnlineExamStatisticDAO;
import com.OnlineExam.deloitte.dao.OnlineExamUserDAO;
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
	public List<Question> listQuestions(String category) {
		return onlineExamQuestionDAO.findByQuestionCategory(category);
	}

	@Override
	public List<Question> listQuestions() {
		return (List<Question>) onlineExamQuestionDAO.findAll();
	}

	@Override
	public Question getQuestion(String question) {
		Optional<Question> optionalProduct = onlineExamQuestionDAO.findById(question);
		Question qn = new Question();
		if (optionalProduct.isPresent()) {
			qn = optionalProduct.get();
		}
		return qn;

	}

	@Override
	public void deleteQuestion(String question) {
		onlineExamQuestionDAO.deleteById(question);
	}

	@Override
	public List<Statistic> listUserStat(String email) {
		return onlineExamStatisticDAO.findByStatEmail(email);
	}

	@Override
	public boolean checkUserExists(String email) {
		return onlineExamUserDAO.existsById(email);
	}

	@Override
	public List<Statistic> listStatistics() {
		return (List<Statistic>) onlineExamStatisticDAO.findAll();
	}

	@Override
	public void addQuestion(Question question) {
		onlineExamQuestionDAO.save(question);
	}
}
