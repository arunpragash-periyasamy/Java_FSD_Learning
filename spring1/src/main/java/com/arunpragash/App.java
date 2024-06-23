package com.arunpragash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arunpragash.config.AppConfig;

public class App 
{

    // Main Method for Java Based Configuration

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop desktop = context.getBean(Desktop.class);
        desktop.compile();
        ((AnnotationConfigApplicationContext) context).close();
    }


    // Main  Method for the XML Configuration

    // public static void main( String[] args )
    {
        // @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("InnerBean.xml");
        try{
            Alien alien = (Alien) context.getBean("alien");
             alien.code();
             System.out.println(alien.getName());
             System.out.println(alien.getRole());
         } finally {
            // Closing the context resources
             ((ClassPathXmlApplicationContext)context).close();
        }
    }
}
