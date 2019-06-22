package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Address;
import com.example.model.Employee;
import com.example.service.AddressService;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/")
public class MainController {

	@Autowired
	private EmployeeService empSer;
	
	@Autowired
	private AddressService addSer;
	
	@Autowired
	private Address add;
	
	@Autowired
	private Employee emp;
	
	@RequestMapping("/check")
	public String checkData() {
		return "Working fine... go on!!!";
	}
	
	@Transactional(rollbackFor=NumberFormatException.class)
	@RequestMapping("/setData")
	public String setData(){
		add.setDetails("Gurugram");
		add.setId(2);		
		add.setPost(110022);
		
		emp.setId(2);
		emp.setName("Niharika");
		emp.setAddress(add);
		
		addSer.saveAddress(add);
		int a=0;
		if(a==0) {
			throw new NumberFormatException();
		}
		empSer.saveEmployee(emp);
		
		return "Data Inserted";
	}
}
