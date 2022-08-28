package com.spring.dependy.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default"})
public class DevEnvironmenteService implements EnvironmenteService{

	@Override
	public String getEnvironmente() {
		// TODO Auto-generated method stub
		return "Dev";
	}

}
