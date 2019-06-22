package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer>{

}
