package com.mehmed.validationandexceptionhandle.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionResponse {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String , String> exceptionHandler(MethodArgumentNotValidException exception) {
		Map<String , String> map = new HashMap<>();
		exception.getBindingResult().getFieldErrors().forEach(error -> {
			map.put(error.getField(), error.getDefaultMessage());
		});
		return map;
	}
}
