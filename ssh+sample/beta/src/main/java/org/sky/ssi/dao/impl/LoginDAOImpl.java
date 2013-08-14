package org.sky.ssi.dao.impl;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.sky.ssi.dao.LoginDAO;
import org.sky.ssi.ibatis.IBatisDAOSupport;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAOImpl extends IBatisDAOSupport<LoginDAO> implements LoginDAO {

	public int validLogin(Map<String, Object> paraMap) throws Exception {
		SqlSession session = this.getSqlSession();
		try {
			return this.getMapper(LoginDAO.class, session).validLogin(paraMap);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new Exception(e);
		} finally {
			this.closeSqlSession(session);
		}
	}

}
