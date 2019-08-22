package com.price.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.price.service.model.Item;
import com.price.service.model.Price;

@Configuration
public class PriceItemConfiguration {

	@Bean
	public Item getItem() {
		return new Item();
	}
	
	@Bean
	public Price getPrice() {
		return new Price();
	}
}
