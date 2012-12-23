package com.bjsxt.dao.impl;

import org.springframework.stereotype.Component;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;

@Component
public class UserDAOImpl implements UserDAO {
	
	private int daoId;
	private String status;
	
	public int getDaoId() {
		return daoId;
	}

	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void save(User user) {
		System.out.println(this.daoId + " " + this.status + " user " + user.getUsername() + " saved!");
	}

}
