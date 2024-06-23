package com.arunpragash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.arunpragash.Alien;
import com.arunpragash.Desktop;

@Configuration

public class AppConfig {
    // @Bean // Annotation to make spring to use it.
    // @Bean(name="com2") //changing the name of the Bean to access
    @Bean(name={"com2", "desktop", "Monster"}) // array of names mentioned to use with different names
    // @Scope("prototype") // It is used to create new objects for every time. 
    public Desktop desktop()
    {
        return new Desktop();
    }

    @Bean
    public Alien alien() {
        return new Alien(); 
    }

    
}
