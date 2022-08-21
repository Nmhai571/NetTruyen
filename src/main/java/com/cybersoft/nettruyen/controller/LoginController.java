package com.cybersoft.nettruyen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class LoginController {
	
	@GetMapping("")
	public String index() {
		return "hello net truyen";
	}
}
