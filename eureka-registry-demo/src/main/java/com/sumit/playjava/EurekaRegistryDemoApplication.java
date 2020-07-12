package com.sumit.playjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaRegistryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegistryDemoApplication.class, args);
	}

}
