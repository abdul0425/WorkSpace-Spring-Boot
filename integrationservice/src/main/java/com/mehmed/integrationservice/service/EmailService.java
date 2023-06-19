package com.mehmed.integrationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mehmed.integrationservice.dto.EmailDto;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public ApplicationResponse sendSimpleMail(EmailDto dto) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		ApplicationResponse response = new ApplicationResponse();
		mailMessage.setFrom(dto.getFrom());
		mailMessage.setTo(dto.getTo());
		mailMessage.setSubject(dto.getSubject());
		mailMessage.setText(dto.getBody());

		javaMailSender.send(mailMessage);

		response.setData("Registered Successfully !");
		response.setError(null);
		response.setStatus(HttpStatus.FOUND.value());
		response.setStatusCode(HttpStatus.ACCEPTED.value());
		return response;

	}

	public void sendMailWithAttachment(EmailDto dto) {

	}
}
