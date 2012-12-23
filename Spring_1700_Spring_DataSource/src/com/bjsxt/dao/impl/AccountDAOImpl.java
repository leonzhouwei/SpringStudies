package com.bjsxt.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.bjsxt.dao.AccountDAO;
import com.bjsxt.model.Account;

@Component
public class AccountDAOImpl implements AccountDAO {
	
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Resource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void save(Account account) {
		//Hibernate
		//JDBC
		//XML
		//NetWork
		try {
			Connection connection = dataSource.getConnection();
			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO account (id, name, password) VALUES (default, ");
			sb.append("'");
			sb.append(account.getName());
			sb.append("'");
			sb.append(", ");
			sb.append("'");
			sb.append(account.getPassword());
			sb.append("'");
			sb.append(");");
			String sql = sb.toString();
			connection.createStatement().execute(sql);
			System.out.println("user saved!");
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//throw new RuntimeException("exeption!");
	}

}
