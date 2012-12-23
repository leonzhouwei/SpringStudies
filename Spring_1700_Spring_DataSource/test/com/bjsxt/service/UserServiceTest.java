package com.bjsxt.service;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.model.Account;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		AccountService service = (AccountService)ctx.getBean("accountService");
		System.out.println(service.getClass());
		Account account = new Account();
		String name = "zhangsan";
		String password = name;
		account.setName(name);
		account.setPassword(password);
		service.add(account);
	}

}
