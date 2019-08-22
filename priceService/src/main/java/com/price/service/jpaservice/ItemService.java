package com.price.service.jpaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.price.service.model.Item;
import com.price.service.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository it;
	
	public void saveItem(Item item) {
		it.save(item);
	}
}
