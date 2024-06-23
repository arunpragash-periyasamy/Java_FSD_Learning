package com.arunpragash.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.arunpragash.Alien;
import com.arunpragash.Computer;
import com.arunpragash.Desktop;
import com.arunpragash.Laptop;



// Auto Configuration
@Configuration
@ComponentScan("com.arunpragash")
public class AppConfig {
    
}


// Manual configuration of the appConfig
// @Configuration

// public class AppConfig {
//     // @Bean // Annotation to make spring to use it.
//     // @Bean(name="com2") //changing the name of the Bean to access
//     @Bean(name={"com2", "desktop", "Monster"}) // array of names mentioned to use with different names
//     // @Scope("prototype") // It is used to create new objects for every time. 
//     public Desktop desktop()
//     {
//         return new Desktop();
//     }
    
//     // @Bean
//     // public Alien alien(Computer com) {
//     //     Alien alien = new Alien();
//     //     alien.setCom(com);
//     //     alien.setName("Arunpragash");
//     //     return alien; 
//     // }
    
//     @Bean
//     public Alien alien(@Qualifier("desktop") Computer com) {  //using @Qualifier annotation we can mention the name of the bean to access.
//         Alien alien = new Alien();
//         alien.setCom(com);
//         alien.setName("Arunpragash");
//         return alien; 
//     }
    
//     @Bean
//     @Primary
//     public Laptop laptop() {
//         return new Laptop();
//     }
    
// }
