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

import com.iiht.dto.UserDTO;
import com.iiht.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/user/add")
	public ResponseEntity<UserDTO> addUser(@RequestBody @Valid UserDTO userDTO,
																BindingResult result) {
		return null;
	}
	
	@GetMapping(value = "/users")
	public ResponseEntity<List<UserDTO>> viewAllUsers() {
		return null;
	}
	
	@DeleteMapping(value = "/removeUser/{userId}")
	public  ResponseEntity<UserDTO> deleteUser(@PathParam("userId") String userId){
		return null;
	}
	
	@PutMapping(value = "/editUser")
	public  ResponseEntity<UserDTO> updateGiftCards(@Valid @RequestBody UserDTO userDTO,
																	BindingResult result){
		return null;
	}


}
