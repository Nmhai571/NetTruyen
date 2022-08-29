package com.cybersoft.nettruyen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.nettruyen.entity.Roles;
import com.cybersoft.nettruyen.entity.Users;
import com.cybersoft.nettruyen.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService userService;
	
	@PostMapping("/register")
	public String registerUser(@RequestParam("fullname") String fullName, @RequestParam("email") String email, @RequestParam("pass") String pass, @RequestParam("gender") String gender, @RequestParam("id_role") int roleID) {
		
		Users users = new Users();
		Roles roles = new Roles();
		users.setFullName(fullName);
		users.setEmail(email);
		users.setPassword(pass);
		users.setGender(gender);
		roles.setId(roleID);
		users.setRoles(roles);
		
		userService.register(users);
		return "thanh cong";
	}
}
