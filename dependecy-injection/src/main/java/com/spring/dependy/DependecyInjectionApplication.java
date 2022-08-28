package com.spring.dependy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.dependy.profiles.EnvironmenteService;
import com.spring.dependy.scope.ExampleScope;

@SpringBootApplication
public class DependecyInjectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependecyInjectionApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependecyInjectionApplication.class, args);	
		ExampleScope exampleScope = context.getBean(ExampleScope.class);
		ExampleScope exampleScope1 = context.getBean(ExampleScope.class);
		log.info("are beans equals {}" , exampleScope.equals(exampleScope1) );
		log.info("are beans equals {}" , exampleScope == exampleScope1 );
	}

}
