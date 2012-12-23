package test.java.com.bjsxt.service;

import main.java.com.bjsxt.model.Account;
import main.java.com.bjsxt.service.AccountService;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		String[] configLocations = {
			"classpath:/resource/java/spring/appconfig/beans.xml"
		};
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(configLocations);
		
		AccountService service = (AccountService)ctx.getBean("accountService");
		System.out.println(service.getClass());
		Account account = new Account();
		String name = "lisi";
		String password = name;
		account.setName(name);
		account.setPassword(password);
		service.add(account);
	}

}
