package com.OnlineExam.deloitte.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.OnlineExam.deloitte.model.Question;
import com.OnlineExam.deloitte.model.Statistic;

public interface OnlineExamStatisticDAO extends CrudRepository<Statistic, String>{
	
	public List<Statistic> findByStatEmail(String email);

}
