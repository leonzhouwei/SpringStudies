package test.java.com.bjsxt.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

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
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		TimeZone tz = TimeZone.getTimeZone("GMT");
		sdf.setTimeZone(tz);
		String name = sdf.format(date);
		String password = name;
		account.setName(name);
		account.setPassword(password);
		System.out.println("new account to create is " + account.getName());
		service.add(account);
	}

}
