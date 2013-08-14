package org.sky.ssh1.alpha.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sky.ssh1.alpha.dao.StudentDAO;
import org.sky.ssh1.alpha.dbo.StudentDBO;
import org.sky.ssh1.alpha.student.form.StudentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {
	private Log logger = LogFactory.getLog(this.getClass());
	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private Map sql = null;

	public void setSql(Map sql) {
		this.sql = sql;
	}

	@Override
	public List<StudentDBO> getAllStudent() throws Exception {
		List<StudentDBO> stdList = new ArrayList<StudentDBO>();
		stdList = jdbcTemplate.query((String) sql.get("getAllStudent"), new Object[] {}, stdItemRowMapper());
		return stdList;
	}

	public void addStudent(final String stdName) throws Exception {
		jdbcTemplate.update((String) sql.get("addStudent"), new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, stdName);
			}
		});
	}

	public void delStudent(final String stdNo) throws Exception {
		jdbcTemplate.update((String) sql.get("delStudent"), new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, stdNo);
			}
		});
	}

	private RowMapper stdItemRowMapper() {
		return new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				StudentDBO stdDbo = new StudentDBO();
				stdDbo.setStudentNo(rs.getString(1));
				stdDbo.setStudentName(rs.getString(2));
				return stdDbo;
			}

		};
	}
}
