package com.example.zhouwei.spring;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.example.zhouwei.spring.model.User;
import com.example.zhouwei.spring.service.UserService;

@ContextConfiguration("classpath:beans.xml")
public class UserServiceTest extends AbstractJUnit4SpringContextTests {

	@Resource(name="userService")
	private UserService userService;
	
	@Test
	public void testAdd() throws Exception {
		userService.add(new User());
		userService.delete(new User());
	}

}
