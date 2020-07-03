package com.sumit.playjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.playjava.model.User;
import com.sumit.playjava.model.UserRepo;

@RestController
public class RegsitrationController {

	@Autowired
	private UserRepo userRepo;
	
	@RequestMapping("/check")
	public String registercheck() {
		return "check register !!!";
	}
	
	@RequestMapping("/register-user/{userName}/{password}")
	public String registerUser(@PathVariable("userName") String userName,
			@PathVariable("password") String password) {
		System.out.println("=====In register microservice from login microservice start");

		User u=new User();
		u.setId(5);
		u.setName(userName);
		u.setPassword(password);
		userRepo.save(u);
		System.out.println("=====In register microservice from login microservice end");
		return "Successfully registered !!!";
	}
}
