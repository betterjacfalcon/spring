package com.spring.dependy.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.spring.dependy.lifecycle.LifeCycleBean;

@Component
public class Devs4jBeanPostProcess implements BeanPostProcessor {

	private static final Logger log = LoggerFactory.getLogger(Devs4jBeanPostProcess.class);
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof LifeCycleBean) {
			log.info("Before Initialization {}", beanName);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof LifeCycleBean) {
			log.info("After Initialization {}", beanName);
		}
		return bean;
	}
	
}
