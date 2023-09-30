package com.okta.scim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/health")
	public String health() {
		
		return "Scim Application is Up and running........";
		
		
	}

}
