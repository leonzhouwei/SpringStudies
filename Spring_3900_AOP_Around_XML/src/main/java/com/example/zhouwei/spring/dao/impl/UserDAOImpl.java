package com.example.zhouwei.spring.dao.impl;

import org.springframework.stereotype.Component;

import com.example.zhouwei.spring.dao.UserDAO;
import com.example.zhouwei.spring.model.User;

@Component("u") 
public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		//Hibernate
		//JDBC
		//XML
		//NetWork
		System.out.println("user saved!");
		//throw new RuntimeException("exeption!");
	}
	
	public void delete(User user) {
		System.out.println("user deleted");
	}

}
