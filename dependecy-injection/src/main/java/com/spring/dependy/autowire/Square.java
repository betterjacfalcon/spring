package com.spring.dependy.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Square implements Figure {
	
	@Value("${square.side}")
	private double side;
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
