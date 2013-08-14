package org.sky.ssh1.alpha.dao.impl;

import org.sky.ssh1.alpha.dao.LoginDAO;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.*;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private String sql = "";

	public void setSql(String sql) {
		this.sql = sql;
	}

	public boolean login(String loginId, String loginPwd) throws Exception {
		boolean answer = false;
		int recordCount = 0;
		recordCount = jdbcTemplate.queryForInt(sql, loginId, loginPwd);
		if (recordCount == 1) {
			answer = true;
		}
		return answer;
	}

}
