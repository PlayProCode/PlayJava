package com.example.transactionPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.Address;
import com.example.model.Employee;

@SpringBootApplication
@ComponentScan({"com.example.configuration","com.example.service","com.example.controller"})
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.repository")
public class TransactionPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionPracticeApplication.class, args);
	}

}
