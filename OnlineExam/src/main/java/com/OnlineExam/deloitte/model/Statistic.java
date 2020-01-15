package com.OnlineExam.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "hr", name = "statistic")
public class Statistic {

	@Column
	private String statCategory;
	@Id
	private String statDateTime;
	@Column
	private String stateName;
	@Column
	private String statEmail;
	@Column
	private int statScore;
	public String getStatCategory() {
		return statCategory;
	}
	public void setStatCategory(String statCategory) {
		this.statCategory = statCategory;
	}
	public String getStatDateTime() {
		return statDateTime;
	}
	public void setStatDateTime(String statDateTime) {
		this.statDateTime = statDateTime;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStatEmail() {
		return statEmail;
	}
	public void setStatEmail(String statEmail) {
		this.statEmail = statEmail;
	}
	public int getStatScore() {
		return statScore;
	}
	public Statistic() {
		super();
	}
	@Override
	public String toString() {
		return "Statistic [statCategory=" + statCategory + ", statDateTime=" + statDateTime + ", stateName=" + stateName
				+ ", statEmail=" + statEmail + ", statScore=" + statScore + "]";
	}
	public Statistic(String statCategory, String statDateTime, String stateName, String statEmail, int statScore) {
		super();
		this.statCategory = statCategory;
		this.statDateTime = statDateTime;
		this.stateName = stateName;
		this.statEmail = statEmail;
		this.statScore = statScore;
	}
	public void setStatScore(int statScore) {
		this.statScore = statScore;
	}

	
}
