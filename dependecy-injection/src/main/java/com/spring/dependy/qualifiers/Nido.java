/**
 * 
 */
package com.spring.dependy.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author jacfa
 *
 */
@Component
public class Nido {

	@Autowired	
	private Animal animal;
	
	private static final Logger log = LoggerFactory.getLogger(Nido.class);
	
	public void imprimir() {		
		log.info("mi nido tiene al animal {} ", animal.getNombre());	
	}
}
