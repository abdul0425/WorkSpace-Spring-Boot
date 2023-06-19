package com.mehmed.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mehmed.annotation.service.Animal;

@Controller
@ResponseBody
@RequestMapping(value="/")
public class AnimalController {

	/*
	 * @Qualifier(value = "dog")
	 * 
	 * @Autowired
	 */
	
	/* private Animal animal; */
	
	@Autowired
	private Animal cat;
	
	/*
	 * @Autowired public void setAnimal(@Qualifier("dog") Animal animal) {
	 * this.animal = animal; }
	 */
	
	/*
	 * @Autowired(required = false) public AnimalController(@Qualifier("cat") Animal
	 * animal) { this.animal = animal; }
	 */
	
	/*
	 * @Autowired(required = false) public void setAnimal(@Qualifier("cat") Animal
	 * animal) { this.animal = animal; }
	 */
	
	/*
	 * @GetMapping(value="/animalBehaviour") public String getAnimalBehaviour() {
	 * return animal.animalSound(); }
	 */
	
	@GetMapping(value="/animalBehaviour")
	public String getAnimalBehaviour() {
		return cat.animalSound();
	}
	
	
	
	@GetMapping(value="/checking")
	public String checkingStatus() {
		return " Working Fine ";
	}
}
