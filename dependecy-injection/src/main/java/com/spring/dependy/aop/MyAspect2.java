package com.spring.dependy.aop;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyAspect2 {
	private static final Logger log = LoggerFactory.getLogger(MyAspect2.class);

	@Before("PointcutsExample.targetObjectMethods()")
	public void before(JoinPoint joinPoint) {
		log.info("2 - Method name {}",joinPoint.getSignature().getName() );
		log.info("2 - Method type {}",joinPoint.getSignature().getDeclaringType() );
		log.info("2 - Method modifiers {}",joinPoint.getSignature().getModifiers() );
		log.info("2 - Arguments {}",joinPoint.getArgs() );
		log.info("2 - isPublic {}",Modifier.isPublic(joinPoint.getSignature().getModifiers()) );
		log.info("2 - Before advice {}");
	}
}
