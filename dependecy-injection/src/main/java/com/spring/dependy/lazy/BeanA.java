package com.spring.dependy.lazy;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanA {
	private static final Logger log = LoggerFactory.getLogger(BeanA.class);

	/**
	 * Se ejecutara despues de la inyeaccion de dependecia
	 */
	@PostConstruct
	public void init() {
		log.info("Post Construct Bean A {} ");
	}
}
