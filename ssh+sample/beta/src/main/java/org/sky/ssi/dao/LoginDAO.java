package org.sky.ssi.dao;

import java.util.Map;

public interface LoginDAO {
	public int validLogin(Map<String, Object> paraMap) throws Exception;
}
