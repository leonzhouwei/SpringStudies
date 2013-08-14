package com.example.zhouwei.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;


public class LogInterceptor {
	
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around() began");
		final int times = 3;
		Object object = null;
		int i = 0;
		for (; i < times; ++i) {
			try {
				object = pjp.proceed();	
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		System.out.println("around() ended with i==" + i);
		
		return object;
	}
	
}
