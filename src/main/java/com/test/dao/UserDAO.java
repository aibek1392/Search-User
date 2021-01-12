package com.test.dao;

import java.util.List;

import com.test.model.User;

public interface UserDAO {

	public void addUser(User user);
	
	public List<User> getAllUsers();
	
	public void change(User user);
	
	public void deleteUser(Integer id);
	
	public User getUserById(Integer id);

}
