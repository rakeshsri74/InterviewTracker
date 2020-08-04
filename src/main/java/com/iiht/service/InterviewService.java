package com.iiht.service;

import java.util.List;

import com.iiht.dto.InterviewDTO;
import com.iiht.model.Interview;

public interface InterviewService {

	public InterviewDTO addNewInterview(InterviewDTO interview);
	
	public InterviewDTO editInterview(InterviewDTO interview);
	
	public List<InterviewDTO> showAllInterviews();
	
	public InterviewDTO deleteInterview(long interviewId);
	
	public InterviewDTO searchInterviewByName(String interviewName);
	
	public InterviewDTO searchByInterviewerName(String interviewerName);
	
	public int displayCountOfInterview();
}
