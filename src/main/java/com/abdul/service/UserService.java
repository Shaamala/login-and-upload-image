package com.abdul.service;

import com.abdul.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
