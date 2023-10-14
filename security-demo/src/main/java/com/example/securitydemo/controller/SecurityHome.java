package com.example.securitydemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.securitydemo.service.UserService;

@RestController
@RequestMapping("/home")
public class SecurityHome {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getUser() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/user-details")
	public String getUserDetails() {
		return "In user-details !";
	}
	
	@GetMapping("/admin-details")
	public String getAdminDetails() {
		return "In admin-details!";
	}
}
