package com.anupam.Spring_mvc_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anupam.Spring_mvc_project.dao.UserDao;
import com.anupam.Spring_mvc_project.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	public int createUser(User user) {
		return this.userDao.saveUser(user);	
	}

}
