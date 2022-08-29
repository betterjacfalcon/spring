package com.spring.dependy.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutsExample {

	@Pointcut("execution(* com.spring.dependy.aop.TargetObject.*(..))")
	public void targetObjectMethods() {
		
	}
}
