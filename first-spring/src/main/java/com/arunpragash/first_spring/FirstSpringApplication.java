package com.arunpragash.first_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		alien.code();
	}

}
