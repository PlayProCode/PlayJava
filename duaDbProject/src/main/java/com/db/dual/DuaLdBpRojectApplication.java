package com.db.dual;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.dual.book.repository.BookRepository;
import com.db.dual.model.book.Book;
import com.db.dual.model.user.User;
import com.db.dual.user.repository.UserRepository;

@SpringBootApplication
@RestController
/*@ComponentScan(basePackages= "{com.db.dual.*}")
*/public class DuaLdBpRojectApplication {

	@Autowired
	private BookRepository br;
	
	@Autowired
	private UserRepository ur;
	
	@PostConstruct
	public void addDataToDb() {
		ur.save(Stream.of(new User(123,"Sumit"),new User(124,"Amit")).collect(Collectors.toList()));
		br.save(Stream.of(new Book(111,"Core Java"),new Book(222,"Spring Boot")).collect(Collectors.toList()));
	}
	
	
	@GetMapping("/getBooks")
	public String getBooks(){
		System.out.println(br.findAll());
		return br.findAll()+"";
	}
	
	@GetMapping("/getUsers")
	public String getUsers(){
		System.out.println(ur.findAll());
		return ur.findAll()+"";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DuaLdBpRojectApplication.class, args);
	}

}
