package com.spring.dependy.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.spring.dependy.DependecyInjectionApplication;

public class ExplicitBean {
	
	private static final Logger log = LoggerFactory.getLogger(ExplicitBean.class);

//Definir un bean de forma explicita
	
	@PostConstruct
	public void init() {
		log.info("Init method ");
	}
	
	@PreDestroy
	public void destroy() {
		log.info("Destroy method ");
	}
}
