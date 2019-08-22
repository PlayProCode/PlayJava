package com.price.service.jpaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.price.service.model.Item;
import com.price.service.model.Price;
import com.price.service.repository.PriceRepository;

@Service
public class PriceService {

	@Autowired
	private PriceRepository pr;
	public void savePrice(Price p) {
		pr.save(p);
	}
	public Integer getPriceUsingItem(Item i) {
		return pr.findOne(i.getPrice().getId()).getPrice();
	}
}
