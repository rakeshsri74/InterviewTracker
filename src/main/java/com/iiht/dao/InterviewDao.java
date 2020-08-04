package com.iiht.dao;

import java.util.List;

import com.iiht.model.Interview;

public interface InterviewDao {

	public void addNewInterview(Interview interview);
	
	public void editInterview(Interview interview);
	
	public List<Interview> showAllInterviews();
	
	public void deleteInterview(long interviewId);
	
	public Interview searchInterviewByName(String interviewName);
	
	public Interview searchByInterviewerName(String interviewerName);
	
	public int displayCountOfInterview();
}
