package com.sumit.playjava;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCaching///1st enable caching in class
public class MyController {

	@GetMapping("/check-cache")
	@Cacheable("userInfo") //provide cacheable annotation where you want data to be cached
	public String checkCache() {
		System.out.println("============UserData============");
		return "Hello user";
	}
}
