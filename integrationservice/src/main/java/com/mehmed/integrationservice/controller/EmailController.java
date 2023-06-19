package com.mehmed.integrationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.integrationservice.constant.AppConfiguration;
import com.mehmed.integrationservice.dto.EmailDto;
import com.mehmed.integrationservice.service.ApplicationResponse;
import com.mehmed.integrationservice.service.EmailService;

@RestController
@RequestMapping(value=AppConfiguration.EMAIL_SERVICE)
public class EmailController {

	
	@Autowired
	private EmailService emailService;
	
	@PostMapping(value=AppConfiguration.SEND_PLAIN_EMAIL_FUNCTIONALITY)
	public ApplicationResponse sendPlainEmail(@RequestBody EmailDto dto) {
		return emailService.sendSimpleMail(dto);
	}
}
