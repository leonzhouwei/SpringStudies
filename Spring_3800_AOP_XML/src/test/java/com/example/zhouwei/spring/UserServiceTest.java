package com.example.zhouwei.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.zhouwei.spring.model.User;
import com.example.zhouwei.spring.service.UserService;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = (UserService)ctx.getBean("userService");
		System.out.println(service.getClass());
		service.add(new User());
		service.delete(new User());
	}

}
