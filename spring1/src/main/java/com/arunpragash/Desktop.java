package com.arunpragash;

import org.springframework.stereotype.Component;

// @Component("com2") // using different name to access the bean
@Component
public class Desktop implements Computer{

    @Override
    public void compile() {
        System.out.println("Compiling the code from the Desktop");
    }
    
}
