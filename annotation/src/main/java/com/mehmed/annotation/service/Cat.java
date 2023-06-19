package com.mehmed.annotation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/* @Primary */
@Service
public class Cat implements Animal{

	@Override
	public String animalSound() {
		return "Meow-Meow";
	}

}
