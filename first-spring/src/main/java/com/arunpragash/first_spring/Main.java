package com.arunpragash.first_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);
		Alien alien = context.getBean(Alien.class);
		alien.code();

		Alien alien2 = context.getBean(Alien.class);
		System.out.println(alien == alien2); // both the objects alien and alien2 are same object

		// Laptop laptop = context.getBean(Laptop.class);
		// laptop.compile();
	}

}
