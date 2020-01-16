package com.OnlineExam.deloitte.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.OnlineExam.deloitte.model.ExamUser;
import com.OnlineExam.deloitte.model.Question;
import com.OnlineExam.deloitte.model.Statistic;

public interface OnlineExamUserDAO extends CrudRepository<ExamUser, String>{

}
