package com.example.securitydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Config {

	@Bean
	public UserDetailsService userDetailsService() {
		return new InMemoryUserDetailsManager(

				User.builder().username("sumit")
						// sumit123
						.password("$2a$10$0K4.io7JQALgF3S2LR03CuSfVYNZLewzJU12Z0ITil7MrJupytPbe").roles("admin")
						.build(),

				User.builder().username("Ajay")
						// Ajay123
						.password("$2a$10$lPX263On5NgtCDy4f8d0xeZef7priCpb4.DraiE5P3JgN3WdVXm7u").roles("user")
						.build());

	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		 http.authorizeRequests()
	      .requestMatchers("/home/user-details/**").access("hasRole('user')")
	      .requestMatchers("/home/admin-details/**").hasRole("admin")
	      .and()
	      // some more method calls
	      .formLogin();
	    return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
