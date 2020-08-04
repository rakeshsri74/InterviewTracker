package com.iiht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.UserDao;
import com.iiht.dto.UserDTO;
import com.iiht.model.User;

@Service("userService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public UserDTO registerUser(UserDTO user) {
		return null;
	}

	public UserDTO updateUser(UserDTO user) {
		return null;
		
	}

	public List<UserDTO> listUsers() {
		return null;
	}

	public UserDTO deleteUser(long userId) {
		return null;
	}

		
	
}
