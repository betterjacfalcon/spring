package com.spring.dependy.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Figure{

	@Value("2.5")
	private double radius;
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

}
