package com.iiht.dao;

import java.util.List;

import com.iiht.model.User;

public interface UserDao {

	public void registerUser(User user);
	
	public void updateUser(User user);
	
	public List<User> listUsers();
	
	public void deleteUser(long userId);
}
