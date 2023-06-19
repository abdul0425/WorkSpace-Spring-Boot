package com.mehmed.integrationservice.dto;

import java.io.Serializable;


public class EmailDto implements Serializable{

	private String subject;
	private String text;
	private String to;
	private String from;
	
	public EmailDto() {
		super();
	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return text;
	}
	public void setBody(String text) {
		this.text = text;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	@Override
	public String toString() {
		return "EmailDto [subject=" + subject + ", body=" + text + ", to=" + to + ", from=" + from + "]";
	}
	
}
