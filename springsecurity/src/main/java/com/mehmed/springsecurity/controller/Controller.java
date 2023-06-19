package com.mehmed.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping(value = "/home")
	public String homePage() {
		return "welcome.jsp";
	}
}
