package com.arunpragash.springMVCDemo;

public class Alien {
    private int Aid;
    private String name;
    private String country;

    public void setAid(int aid) {
        Aid = aid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAid() {
        return Aid;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Alien [Aid=" + Aid + ", name=" + name + ", country=" + country + "]";
    }
}
