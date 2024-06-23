package com.arunpragash;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    @Override
    public void compile() {
        System.out.println("Compiling the code from the Desktop");
    }
    
}
