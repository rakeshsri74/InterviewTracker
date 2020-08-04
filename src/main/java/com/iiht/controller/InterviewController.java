package com.iiht.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iiht.dto.InterviewDTO;
import com.iiht.dto.UserDTO;
import com.iiht.service.InterviewService;

@Controller
public class InterviewController {

	@Autowired
	private InterviewService interviewService;

	@PostMapping(value = "/interview/add")
	public ResponseEntity<InterviewDTO> addInterview(@RequestBody @Valid InterviewDTO interviewDTO,
																BindingResult result) {
		return null;
	}
	
	@GetMapping(value = "/interviews")
	public ResponseEntity<List<InterviewDTO>> viewAllInterviews() {
		return null;
	}
	
	@DeleteMapping(value = "/removeInterview/{interviewId}")
	public  ResponseEntity<InterviewDTO> deleteInterview(@PathParam("interviewId") String interviewId){
		return null;
	}
	
	@PutMapping(value = "/editInterview")
	public  ResponseEntity<InterviewDTO> updateInterview(@Valid @RequestBody InterviewDTO interviewDTO,
																	BindingResult result){
		return null;
	}

	@GetMapping(value = "/interviews/searchInterviewByName")
	public ResponseEntity<InterviewDTO> searchInterviewByName(@PathParam("interviewName") String interviewName) {
		return null;
	}
	
	@GetMapping(value = "/interviews/searchByInterviewerName")
	public ResponseEntity<InterviewDTO> searchByInterviewerName(@PathParam("interviewerName") String interviewerName) {
		return null;
	}
	
	@GetMapping(value = "/interviews/searchByInterviewerName")
	public ResponseEntity<Integer> displayCountOfInterview() {
		return null;
	}
}
