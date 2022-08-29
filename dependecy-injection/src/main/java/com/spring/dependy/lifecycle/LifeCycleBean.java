package com.spring.dependy.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy si el bean es lazy no se inicializara al menos que se inyecte
@Lazy
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean{

	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);
	
	@Override
	public void setBeanName(String name) {
		log.info("Bean name aware {} ", name);		
	}
	
	/**
	 * Se ejecutara despues de la inyeaccion de dependecia
	 */
	@PostConstruct
	public void init() {
		log.info("Post Construct {} ");
	}
	
	
	/**
	 * Se ejecutara antes del que bean se destruido
	 * No se ejecutan para beans protitype
	 * Solo se ejecutan durante una terminacion del VM de forma normal
	 */
	@PreDestroy
	public void destroyBean() {
		log.info("Pre Destroy {} ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("After Properties set method {} ");
		
	}

	@Override
	public void destroy() throws Exception {
		log.info("Destroy method {} ");
		
	}
}
