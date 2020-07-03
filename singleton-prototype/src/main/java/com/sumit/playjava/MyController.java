package com.sumit.playjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//singleton
@RestController
public class MyController {

	@Autowired ///it will always show singleton in this case
	private CheckPrototype checkPrototype;
	
	@GetMapping("/check")
	public String checkScope() {
		//inject here prototype
		System.out.println(getCheckPrototype());//check if singleton or prototype
		return "checked";
	}
	//woun't work in case of private and static methods
	@Lookup//to handle prototype in singleton
	public CheckPrototype getCheckPrototype() {
		return null;
	}
	
	
}
