package com.arunpragash;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile() {
        System.out.println("Compiling the code from the Laptop");
    }
}
