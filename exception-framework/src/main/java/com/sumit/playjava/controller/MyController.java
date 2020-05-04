package com.sumit.playjava.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/error-path")
	public String getData(@PathParam("data") String data){
		if(data.equals(""))
			throw new MyCustomException("Exception occured in MyController class !!!");
		return "Creating Exception Handling Framework !!!";
	}
}
