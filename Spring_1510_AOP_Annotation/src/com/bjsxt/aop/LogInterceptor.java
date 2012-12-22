package com.bjsxt.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {
	
	@Pointcut("execution(public * com.bjsxt.service..*.add(..))")
	//@Pointcut("execution(public * com.bjsxt.dao..*.*(..))")
	public void myMethod() {}
	
	@Before("myMethod()")
	public void before() {
		System.out.println("method before()");
	}

	@AfterReturning("myMethod()")
	public void afterReturning() {
		System.out.println("method afterReturning()");
	}
	
	@AfterThrowing("myMethod()")
	public void afterThrowing() {
		System.out.println("method afterThrowing()");
	}
	
	@Around("myMethod()")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("method around() began");
		pjp.proceed();
		System.out.println("method around() ended");
	}
}
