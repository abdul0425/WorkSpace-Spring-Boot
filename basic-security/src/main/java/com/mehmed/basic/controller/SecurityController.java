package com.mehmed.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class SecurityController {

//	http://localhost:9090/api/user
	@GetMapping(value = "/user")
	public String accessByAdminAndUser() {
		return "Function accessed by ADMIN as well as by USER !";
	}

//	http://localhost:9090/api/admin
	@GetMapping(value = "/admin")
	public String accessByOnlyAdmin() {
		return "Function accessed by only ADMIN !";
	}
}
