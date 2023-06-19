package com.mehmed.pathan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mehmed.pathan.dto.PathanDto;
import com.mehmed.pathan.model.PathanModel;
import com.mehmed.pathan.service.PathanService;

@Controller
@ResponseBody
@RequestMapping("/api")
public class PathanController {

	@Autowired
	private PathanService pathanService;
	
	
	@PostMapping("/saveMovie")
	public ResponseEntity<PathanModel> saveMovie(@RequestBody PathanDto pathanDto) {
		return new ResponseEntity<PathanModel>(pathanService.saveMovie(pathanDto), HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public @ResponseBody PathanModel getDetails(@PathVariable("id") Long id) {
		return pathanService.getDetails(id);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<PathanModel> updateDetails(@RequestBody PathanModel model, @PathVariable("id") Long id) {
		return new ResponseEntity<>(pathanService.updateDetails(model, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public String deleteDetails(@PathVariable("id") Long id) {
		return pathanService.deleteDetails(id);
	}
	
	@GetMapping("/getAll")
	public @ResponseBody List<PathanModel> getAllDetails() {
		return pathanService.getAll();
	}
}
