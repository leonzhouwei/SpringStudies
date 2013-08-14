package org.sky.ssi.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.sky.ssi.dao.StudentDAO;
import org.sky.ssi.ibatis.IBatisDAOSupport;
import org.sky.ssi.dbo.StudentDBO;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl extends IBatisDAOSupport<StudentDAO> implements StudentDAO {

	@Override
	public List<StudentDBO> getAllStudent() throws Exception {
		SqlSession session = this.getSqlSession();
		try {
			return this.getMapper(StudentDAO.class, session).getAllStudent();
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			this.closeSqlSession(session);
		}
	}

	public void addStudent(Map<String, Object> paraMap) throws Exception {
		SqlSession session = this.getSqlSession();
		try {
			this.getMapper(StudentDAO.class, session).addStudent(paraMap);
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			this.closeSqlSession(session);
		}
	}

	public void delStudent(Map<String, Object> paraMap) throws Exception {
		SqlSession session = this.getSqlSession();
		try {
			this.getMapper(StudentDAO.class, session).delStudent(paraMap);
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			this.closeSqlSession(session);
		}
	}
}
