package main.java.com.bjsxt;

import main.java.com.bjsxt.model.Account;
import main.java.com.bjsxt.service.AccountService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup {
	
	public static void main(String[] args) {
		String[] configLocations = { "classpath:/spring/appconfig/beans.xml" };
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(configLocations);
		
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