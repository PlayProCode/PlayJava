package com.boot.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.boot.mongo.model.Employee;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

}
