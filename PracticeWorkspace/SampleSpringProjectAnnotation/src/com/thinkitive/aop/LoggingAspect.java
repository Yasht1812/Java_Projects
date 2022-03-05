package com.thinkitive.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("getAllCircles()")
	public void LoggingAdvice(JoinPoint joinpoint) {
		System.out.println(joinpoint.toString());
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second advice executed");
	}
	
	@Pointcut("execution(* get*(..))")
	public void allGetters() {}
	
	//advice method having a pointcut
	@Pointcut("within(com.thinkitive.aop.Circle)")
	public void getAllCircles() {} 
	
	@AfterReturning("args(name)")
	public void LoggingAdviceAfter(String name) {
		System.out.println("This is running after" + name);
	}
	@AfterThrowing("args(name)")
	public void exceptionAdvice(String name) {
		System.out.println("An Exception is been thrown");
	}

}
