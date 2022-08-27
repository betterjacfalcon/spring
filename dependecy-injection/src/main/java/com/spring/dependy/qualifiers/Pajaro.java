/**
 * 
 */
package com.spring.dependy.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author jacfa
 *
 */
@Component()
@Primary 
public class Pajaro extends Animal implements Volador {

	public Pajaro(@Value(" Pajaro Loco")String nombre, @Value("1") Integer edad) {
		super(nombre, edad);		
	}

	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);
	
	@Override
	public void volar() {
		log.info("Soy un pajaro y estoy volando");		
	}

}
