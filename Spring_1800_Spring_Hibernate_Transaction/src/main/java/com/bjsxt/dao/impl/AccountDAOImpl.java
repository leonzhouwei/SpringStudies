package main.java.com.bjsxt.dao.impl;

import javax.annotation.Resource;

import main.java.com.bjsxt.dao.AccountDAO;
import main.java.com.bjsxt.model.Account;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component("accountDAO")
public class AccountDAOImpl implements AccountDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Account account) {
		Session session = sessionFactory.getCurrentSession();
		session.save(account);
		System.out.println("account saved");
		//throw new RuntimeException("exeption!");
	}

}
