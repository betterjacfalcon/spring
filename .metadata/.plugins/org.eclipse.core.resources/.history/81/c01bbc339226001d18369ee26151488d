package com.spring.dependy;

import java.beans.Expression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@SpringBootApplication
public class DependecyInjectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependecyInjectionApplication.class);
	
	@Bean
	public String getApplication() {
		return "Devs4j rules";
	}

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		org.springframework.expression.Expression expression =  parser.parseExpression("10 + 20");
		log.info("String expression {}", expression.getValue());
	}

}
