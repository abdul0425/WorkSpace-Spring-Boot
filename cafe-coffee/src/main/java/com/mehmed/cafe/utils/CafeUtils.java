package com.mehmed.cafe.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUtils {

	public static ResponseEntity<String> getResponseEntity(String response,HttpStatus status){
		return new ResponseEntity<String>("{message : }"+response,status);
	}
}
