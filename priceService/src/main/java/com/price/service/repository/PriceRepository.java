package com.price.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.price.service.model.Price;

@Repository
public interface PriceRepository extends CrudRepository<Price, Integer>{

}
