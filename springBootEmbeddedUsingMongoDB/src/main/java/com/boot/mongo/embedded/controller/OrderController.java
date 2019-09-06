package com.boot.mongo.embedded.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.mongo.embedded.model.Person;
import com.boot.mongo.embedded.repository.UserRepository;

@RestController
@RequestMapping("/order")

public class OrderController {

	@Autowired
	public UserRepository ur;
	
	@GetMapping("/")
	public String checkApplication() {
		return "<h1>controller is working fine !!!</h1>";
	}
	
	/*
	 * Method to get User by pincode of address
	 */
	@GetMapping("/getUserByPincode/{pincode}")
	public Person returnUserByPincode(@PathVariable Integer pincode) {
		return ur.findUserByPincode(pincode);
	}
	
	/*
	 * Set data to database using post method
	 */
	@PostMapping(value="/setUserToDB",consumes="application/json")
	public String saveUserByPincode(@RequestBody  Person person) {
		System.out.println("aaaaaaaaaaaaa     "+person);
		ur.save(person);
		return "Order details saved successfully !!!";
	}
}
