package org.sky.ssi.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sky.ssi.dao.LoginDAO;
import org.sky.ssi.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
	private Log logger = LogFactory.getLog(this.getClass());
	@Resource
	private LoginDAO loginDAO;

	public boolean login(String loginId, String loginPwd) throws Exception {
		boolean answer = false;
		int result = 0;
		try {
			Map<String, Object> paraMap = new HashMap<String, Object>();
			paraMap.put("loginId", loginId);
			paraMap.put("loginPwd", loginPwd);
			result = loginDAO.validLogin(paraMap);
		} catch (Exception e) {
			result = 0;
			logger.error("login error:" + e.getMessage(), e);
		}
		if (result == 1) {
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}

}
