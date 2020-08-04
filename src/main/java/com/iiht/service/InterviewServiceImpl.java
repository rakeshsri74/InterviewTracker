package com.iiht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.InterviewDao;
import com.iiht.dto.InterviewDTO;
import com.iiht.model.Interview;

@Service("interviewService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class InterviewServiceImpl implements InterviewService {

	@Autowired
	private InterviewDao interviewDao;

	public InterviewDTO addNewInterview(InterviewDTO interview) {
		return null;
		
	}

	public InterviewDTO editInterview(InterviewDTO interview) {
		return null;
		
	}

	public List<InterviewDTO> showAllInterviews() {
		return null;
	}

	public InterviewDTO deleteInterview(long interviewId) {
		return null;
		
	}

	public InterviewDTO searchInterviewByName(String interviewName) {
		// TODO Auto-generated method stub
		return null;
	}

	public InterviewDTO searchByInterviewerName(String interviewerName) {
		// TODO Auto-generated method stub
		return null;
	}

	public int displayCountOfInterview() {
		// TODO Auto-generated method stub
		return 0;
	}

		
}
