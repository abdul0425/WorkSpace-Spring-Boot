package com.mehmed.pathan.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PathanDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String actor;
	private String actress;
	private Double rating;
}
