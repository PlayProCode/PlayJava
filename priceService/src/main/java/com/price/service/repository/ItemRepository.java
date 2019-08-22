package com.price.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.price.service.model.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
