package com.logan.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/ping")
	public String ping() {
		return "User Service responding properly: " + System.currentTimeMillis();
	}
}
