package com.spring.dependy.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdEnvironmenteService implements EnvironmenteService{

	@Override
	public String getEnvironmente() {
		// TODO Auto-generated method stub
		return "Prod";
	}

}
