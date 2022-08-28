package com.spring.dependy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.dependy.profiles.EnvironmenteService;

@SpringBootApplication
public class DependecyInjectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependecyInjectionApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependecyInjectionApplication.class, args);	
		EnvironmenteService environmenteService = context.getBean(EnvironmenteService.class);
		log.info("Active enviroment {}" , environmenteService.getEnvironmente() );
	}

}
