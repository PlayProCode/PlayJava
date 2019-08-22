package com.price.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.price.service.jpaservice.ItemService;
import com.price.service.jpaservice.PriceService;
import com.price.service.model.Item;
import com.price.service.model.Price;

@RestController
public class PriceController {

	@Autowired
	private PriceService ps;
	
	@Autowired
	private ItemService is;
	
	@Autowired
	private Item i;
	
	@Autowired
	private Price p;

	// check if service is working or not
	@RequestMapping("/checkPrice")
	public String helloPrice() {
		return "Price service is working !!!";
	}
	
	// save data in db
	@RequestMapping("/saveData")
	public String saveOnLoad() {
		p=new Price();
		p.setPrice(100);
		i =new Item();
		i.setName("Book");
		i.setPrice(p);
		// save price data
		ps.savePrice(p);
		// save item data
		is.saveItem(i);
		return "data saved successfully !!!";
	}
	
	@RequestMapping("/getPrice/{item}")
	public Integer getPrice(@PathVariable("item") Item item) {
		return ps.getPriceUsingItem(item);
	}
}
