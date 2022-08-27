package com.spring.dependy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.dependy.qualifiers.Animal;
import com.spring.dependy.qualifiers.Avion;
import com.spring.dependy.qualifiers.Nido;
import com.spring.dependy.qualifiers.Pajaro;
import com.spring.dependy.qualifiers.Perro;

@SpringBootApplication
public class DependecyInjectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependecyInjectionApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependecyInjectionApplication.class, args);	
		
		Animal animal = context.getBean(Animal.class);
		Animal animal1 = context.getBean("perrito",Animal.class);
		Nido nido = context.getBean(Nido.class);
		Avion avion = context.getBean(Avion.class);
		Perro perro = context.getBean(Perro.class);	
		Pajaro pajaro = context.getBean(Pajaro.class);
		
		log.info("Objeto Animal1{}", animal.getNombre(), animal.getEdad());
		log.info("Objeto Animal2{}", animal1.getNombre(), animal1.getEdad());
		nido.imprimir();		
		log.info("Objeto perro{}", perro.getNombre());		
		log.info("Objeto pajaro{}", pajaro.getNombre());
		avion.volar();
	}

}
