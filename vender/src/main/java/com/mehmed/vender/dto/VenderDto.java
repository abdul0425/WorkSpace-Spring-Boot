package com.mehmed.vender.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class VenderDto implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String venderName;
	private String location;
	private String contact;
	

}
