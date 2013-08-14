package com.example.zhouwei.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.zhouwei.spring.dao.UserDao;
import com.example.zhouwei.spring.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("/beans.xml");
		UserDao userDao = ac.getBean("userDao", UserDao.class);
		
		User user = new User();
		user.setUsername("alice");
		user.setPassword("alice");
		
		userDao.save(user);
    }
}
