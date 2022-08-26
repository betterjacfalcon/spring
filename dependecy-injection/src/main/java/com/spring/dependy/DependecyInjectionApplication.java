package com.spring.dependy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.dependy.atributo.Coche;

@SpringBootApplication
public class DependecyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependecyInjectionApplication.class, args);	
		
		Coche coche = context.getBean(Coche.class);
		
		System.out.println(coche);
	}

}
