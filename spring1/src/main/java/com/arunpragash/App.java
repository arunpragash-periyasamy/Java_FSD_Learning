package com.arunpragash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");        
        Alien alien = (Alien) context.getBean("alien");
        alien.code();
        System.out.println(alien.getName());
        System.out.println(alien.getRole());
        
    }
}
