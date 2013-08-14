package org.sky.ssh1.alpha.service.impl;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sky.ssh1.alpha.dao.LoginDAO;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements org.sky.ssh1.alpha.service.LoginService {
	private Log logger = LogFactory.getLog(this.getClass());
	@Resource
	private LoginDAO loginDAO;

	public boolean login(String loginId, String loginPwd) throws Exception {
		boolean answer = false;
		try {
			answer = loginDAO.login(loginId, loginPwd);
		} catch (Exception e) {
			logger.error("login error:" + e.getMessage(), e);
		}
		return answer;
	}

}
