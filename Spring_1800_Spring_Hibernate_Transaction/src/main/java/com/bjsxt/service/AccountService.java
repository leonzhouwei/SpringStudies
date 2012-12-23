package main.java.com.bjsxt.service;

import javax.annotation.Resource;

import main.java.com.bjsxt.dao.AccountDAO;
import main.java.com.bjsxt.model.Account;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AccountService {
	
	private AccountDAO accountDAO;  
	
	@Transactional
	public void add(Account account) {
		accountDAO.save(account);
		// e.g. write into database table logger a record to record the save() method upper
	}
	
	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	@Resource(name="accountDAO")
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public void init() {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destroy");
	}
	
}
