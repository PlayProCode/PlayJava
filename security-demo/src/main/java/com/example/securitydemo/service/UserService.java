package com.example.securitydemo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.securitydemo.controller.User;

@Service
public class UserService {

	public List<User> getAllUsers() {
		return Arrays.asList(
				new User("Sumit",21),
				new User("Ajay",22),
				new User("Danish",19)
				);
	}

	
	
}
