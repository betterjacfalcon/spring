package com.spring.dependy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.spring.dependy.lifecycle.ExplicitBean;
import com.spring.dependy.lifecycle.LifeCycleBean;

@SpringBootApplication
public class DependecyInjectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependecyInjectionApplication.class);
	
	@Bean
	public String getApplication() {
		return "Devs4j rules";
	}
	//Definir un bean de forma explicita
	
	@Bean(initMethod="init", destroyMethod="destroy")
	public ExplicitBean getBean() {
		return new ExplicitBean();
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependecyInjectionApplication.class, args);	
		LifeCycleBean bean = context.getBean(LifeCycleBean.class);
	}

}
