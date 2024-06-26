package com.arunpragash;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurationContext context= SpringApplication.run(App.class, args);
        Alien obj = context(Alien.class);

    }
}