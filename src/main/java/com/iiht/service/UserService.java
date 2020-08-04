package com.iiht.service;

import java.util.List;

import com.iiht.dto.UserDTO;

public interface UserService {

	public UserDTO registerUser(UserDTO user);
	
	public UserDTO updateUser(UserDTO user);
	
	public List<UserDTO> listUsers();
	
	public UserDTO deleteUser(long userId);
}
