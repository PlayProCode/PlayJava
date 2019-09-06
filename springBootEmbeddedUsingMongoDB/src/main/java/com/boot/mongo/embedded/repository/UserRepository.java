package com.boot.mongo.embedded.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.boot.mongo.embedded.model.Person;

public interface UserRepository extends MongoRepository<Person, Integer>{

	@Query("{'Address.pincode':?0}")
	public Person findUserByPincode(Integer pincode);

}
