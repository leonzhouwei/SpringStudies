package com.example.zhouwei.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.zhouwei.spring.model.User;
import com.example.zhouwei.spring.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");

		UserService service = (UserService) ctx.getBean("userService");
		System.out.println(service.getClass());
		User user = new User();
		service.add(user);
    }
}
