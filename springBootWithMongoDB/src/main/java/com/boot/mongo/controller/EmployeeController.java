package com.boot.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.mongo.model.Employee;
import com.boot.mongo.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepo;
	
	@PostMapping("/setEmployee")
	public String setEmployee(@RequestBody Employee emp ) {
		empRepo.save(emp);
		return "Employee data inserted with id : "+emp.getId()+" !!!";
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		return empRepo.findAll();
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		empRepo.delete(id);
		return "Ëmployee with id: "+id+" is deleted !!!";
	}
}
