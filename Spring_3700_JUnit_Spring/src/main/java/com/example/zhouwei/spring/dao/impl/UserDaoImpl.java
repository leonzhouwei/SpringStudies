package com.example.zhouwei.spring.dao.impl;

import org.springframework.stereotype.Component;

import com.example.zhouwei.spring.dao.UserDao;
import com.example.zhouwei.spring.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
		System.out.println("\"" + user.getUsername() + " " + user.getPassword() + "\" saved");
	}

}
