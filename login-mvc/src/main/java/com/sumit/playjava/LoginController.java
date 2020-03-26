package com.sumit.playjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.sumit.playjava.model.User;
import com.sumit.playjava.model.UserRepo;

@Controller
public class LoginController {
	
	@Autowired
	private UserRepo userRepo;

	RestTemplate restTemplate=new RestTemplate();
	
	@RequestMapping("/")
	public String checkMVC() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginHomePage(@RequestParam("userName") String userName,
			@RequestParam("password") String password,Model model) {
		User u = null;
		try {
			u=userRepo.findByName(userName);
		}catch (Exception e) {
			System.out.println("User not found !!!");
		}
		if(u!=null) {
			model.addAttribute("UserName", userName);
			return "homePage";
		}
		model.addAttribute("error","User Not Found, Kindly register !!!");
		return "login";
	}

	@RequestMapping("/register")
	public String goToReistrationPage() {
		return "register";
	}
	
	@RequestMapping("/set-user")
	public String goToReisterMicroservice(@RequestParam("userName") String userName,
			@RequestParam("password1") String password1,
			@RequestParam("password2") String password2,Model model) {
		System.out.println("=====going to register microservice from login microservice start");
		if(password1.equals(password2)) {
			restTemplate.getForObject("http://localhost:8081/register-user/"+userName+"/"+password1,
					String.class);
			model.addAttribute("registerSuccess","Successfully registered, kindly login to continue!!!");  
		}else {
			model.addAttribute("registrationError", "Password Not Same !!!");
		}
		System.out.println("=====register microservice from login microservice end");

		return "login";
	}
}
