package com.example.zhouwei.spring.dao;

import com.example.zhouwei.spring.model.User;

public interface UserDAO {
	public void save(User user);

	public void delete(User user);
}
