package com.iiht.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "InterviewInfo")
@Data
public class Interview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "InterviewId")
	private long interviewId;
	
	@Column(name = "InterviewerName")
	private String interviewerName;
	
	@Column(name = "InterviewName")
	private String interviewName;
	
	@Column(name = "UserForInterview")
	private String userForInterview;
	
	@Column(name = "UsersSkill")
	private String usersSkill;
	
	@Column(name = "Time")
	private String time;
	
	@Column(name = "Date")
	private String date;
	
	@Column(name = "InterviewStatus")
	private String interviewStatus;
	
	@Column(name = "TechnicalInterviewStatus")
	private String technicalInterviewStatus;
	
	@Column(name = "Remarks")
	private String remarks;
	
}
