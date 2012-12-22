package com.bjsxt.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {
	@Before("execution(public void com.bjsxt.dao.impl.UserDAOImpl.save(com.bjsxt.model.User))")
	public void before() {
		System.out.println("method before");
	}
	
}
