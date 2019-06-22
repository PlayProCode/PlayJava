package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Address;
import com.example.model.Employee;

@Configuration
public class MyConfiguration {

	@Bean
	public Address getAddress() {
		return new Address();
	}
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
}
