package org.sky.ssh1.alpha.dao;

public interface LoginDAO {
	public boolean login(String loginId, String loginPwd) throws Exception;
}
