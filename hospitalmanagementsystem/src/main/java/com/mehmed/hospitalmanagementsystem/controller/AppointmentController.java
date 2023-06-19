package com.mehmed.hospitalmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.hospitalmanagementsystem.configuration.ApplicationConstant;
import com.mehmed.hospitalmanagementsystem.dto.AppointmentDto;
import com.mehmed.hospitalmanagementsystem.service.AppointmentService;

@RestController
@RequestMapping(value = ApplicationConstant.API_APPOINTMENT)
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping(value = ApplicationConstant.BOOK_APPOINTMENT)
	public void bookAppointment(@RequestBody AppointmentDto appointmentDto) {
		appointmentService.bookAppointment(appointmentDto);
	}
}
