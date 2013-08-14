package com.example.zhouwei.spring.service;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.example.zhouwei.spring.dao.UserDAO;
import com.example.zhouwei.spring.model.User;

@Component("userService")
public class UserService {
	
	private UserDAO userDAO;  
	
	public void init() {
		System.out.println("init");
	}
	
	public void add(User user) {
		userDAO.save(user);
	}
	
	public void delete(User user) {
		userDAO.delete(user);
	}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	@Resource(name="u")
	public void setUserDAO( UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void destroy() {
		System.out.println("destroy");
	}
}
