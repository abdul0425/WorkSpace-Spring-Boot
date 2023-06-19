package com.mehmed.vender.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.vender.dto.VenderDto;
import com.mehmed.vender.model.VenderModel;
import com.mehmed.vender.service.VenderService;

@RestController
@RequestMapping("/api")
public class VenderController {

	public VenderService service;
	
	
	@Autowired
	public VenderController(VenderService service) {
		super();
		this.service = service;
	}
	@PostMapping("/saveVender")
	public ResponseEntity<VenderModel> saveVender(@RequestBody VenderDto dto) {
		ResponseEntity<VenderModel> response = new ResponseEntity<VenderModel>(service.saveVender(dto),HttpStatus.CREATED);
		return response;
	}
	@PutMapping("/updateVender/{id}")
	public ResponseEntity<VenderModel> updateVender(@RequestBody VenderDto dto, @PathVariable("id") Long id) {
		ResponseEntity<VenderModel> response = new ResponseEntity<VenderModel>(service.updateVender(dto, id),HttpStatus.OK);
		return response;
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<VenderModel>> getAllVenders() {
		ResponseEntity<List<VenderModel>> responseList = new ResponseEntity<List<VenderModel>>(service.getAllVenders(),HttpStatus.OK);
		return responseList;
	}
	@GetMapping("/readVender/{venderId}")
	public ResponseEntity<VenderModel> getVender(@PathVariable("venderId") Long id) {
		ResponseEntity<VenderModel> response = new ResponseEntity<VenderModel>(service.getVender(id),HttpStatus.OK);
		return response;
	}
	@DeleteMapping("/deleteVender/{venderId}")
	public ResponseEntity<String> deleteVender(@PathVariable("venderId") Long id) {
		return new ResponseEntity<String>(service.deleteVender(id),HttpStatus.OK);
	}
}
