package com.arunpragash;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component("com2") // using different name to access the bean
@Component
// @Scope("prototype")
public class Desktop implements Computer{

    @Override
    public void compile() {
        System.out.println("Compiling the code from the Desktop");
    }
    
}
