package com.spring.dependy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.spring.dependy.autowire.AreaCalculatorService;
import com.spring.dependy.profiles.EnvironmenteService;
import com.spring.dependy.scope.ExampleScope;

@SpringBootApplication
public class DependecyInjectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependecyInjectionApplication.class);
	
	@Bean
	public String getApplication() {
		return "Devs4j rules";
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependecyInjectionApplication.class, args);	
		AreaCalculatorService calcular = context.getBean(AreaCalculatorService.class);
		log.info("Area Total {}", calcular.calcAreas());
	}

}
