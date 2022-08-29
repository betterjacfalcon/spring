package com.spring.dependy.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TargetObject {
	private static final Logger log = LoggerFactory.getLogger(TargetObject.class);


	public void hello(String messages) {
		log.info(messages);
	}
	
	public void foo() {
		log.info("foo");
	}
}
