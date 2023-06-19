package com.mehmed.vender.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class VenderExceptionHandler {

	@ExceptionHandler({ VenderNotFoundException.class })
	public ResponseEntity<VenderException> handleVenderNotFoundException(VenderNotFoundException exception) {
		VenderException venderException = new VenderException(exception.getMessage(), exception.getCause(),
				HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(venderException, HttpStatus.NOT_FOUND);
	}

}
