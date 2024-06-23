package com.arunpragash;

public class Alien {
    private String name;
    private String role;
    private int expeience;
    private Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    Alien() {
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
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
