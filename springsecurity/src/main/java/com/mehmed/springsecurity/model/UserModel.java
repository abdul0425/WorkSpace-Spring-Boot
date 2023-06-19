package com.mehmed.springsecurity.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "user_security")
@Data
@ToString
public class UserModel implements Serializable{

	@Id
	@Column(name = "user_id")
	private Long userId;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	
	public UserModel() {
		
	}
}
