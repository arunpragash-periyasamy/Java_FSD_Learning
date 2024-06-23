package com.arunpragash;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public void compile() {
        System.out.println("Compiling the code from the Laptop");
    }
}
