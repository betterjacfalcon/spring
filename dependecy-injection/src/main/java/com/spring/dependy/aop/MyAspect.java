package com.spring.dependy.aop;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

	@Before("execution(* com.spring.dependy.aop.TargetObject.*(..))")
	public void before(JoinPoint joinPoint) {
		log.info("Method name {}",joinPoint.getSignature().getName() );
		log.info("Method type {}",joinPoint.getSignature().getDeclaringType() );
		log.info("Method modifiers {}",joinPoint.getSignature().getModifiers() );
		log.info("Arguments {}",joinPoint.getArgs() );
		log.info("isPublic {}",Modifier.isPublic(joinPoint.getSignature().getModifiers()) );
		log.info("Before advice {}");
	}

}
