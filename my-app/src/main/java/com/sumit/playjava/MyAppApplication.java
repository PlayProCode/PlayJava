package com.sumit.playjava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyAppApplication {

	@Value("${server.port}")
	private String port;
	
	@GetMapping("/app")
	public String getApp() {
		return "the port is "+port;
	}
	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}

}
