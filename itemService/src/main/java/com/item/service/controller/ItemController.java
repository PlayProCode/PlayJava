package com.item.service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ItemController {

	
	@RequestMapping("/checkItem")
	public String helloPrice() {
		return "Item service is working !!!";
	}
	
	/*
	 * Get the price of the item using price id.
	 */
	@RequestMapping("/getPrice/{itemId}")
	public String getPrice(@PathVariable("itemId") Integer itemId) {
		RestTemplate rt=new RestTemplate();
		String serverUrl="http://localhost:8080/getPrice/"+itemId;
		Integer itemPrice=rt.getForObject(serverUrl, Integer.class);
		return "Price of the item is : "+itemPrice;
	}
}
