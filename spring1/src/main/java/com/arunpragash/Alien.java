package com.arunpragash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private String name;
    private String role;
    private int expeience;
    
    
    /**
     * There are three types of Auto wiring available
     * Field Autowiring
     * Constructor Autowiring
     * Setter Autowiring
     */

    @Autowired // Field Autowiring
    // @Qualifier("desktop") //Qualifier is used to get the bean by name. The name is basically a class name which the first character starts with small letter.
    private Computer com;


    @Autowired // Setter Autowiring
    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Alien() {
        this.name = "Default Name";
        this.role = "Role";
        this.expeience = 0;
    }

    public int getExpeience() {
        return expeience;
    }


    public void setExpeience(int expeience) {
        this.expeience = expeience;
    }


    @Autowired // constructor Auto wiring
    Alien(Computer com) {
        this.com = com;
    }

    Alien(String name, String role, int experience) {
        this.name = name;
        this.role = role;
        this.expeience = experience;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void code() {
        System.out.println("Coding....");
        com.compile();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
