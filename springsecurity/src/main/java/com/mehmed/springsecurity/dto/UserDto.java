package com.mehmed.springsecurity.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDto implements Serializable{

	private Long userId;
	private String username;
	private String password;
	
	public UserDto() {
		
	}
}
