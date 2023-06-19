package com.mehmed.annotation.service;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal{

	@Override
	public String animalSound() {
		return "Bho-Bho";
	}

}
