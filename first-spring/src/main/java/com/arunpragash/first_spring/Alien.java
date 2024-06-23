package com.arunpragash.first_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    String name;
    @Autowired
    Computer computer;

    
    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("desktop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void code() {
        System.out.println("Coding ... ");
        computer.compile();
    }

}
