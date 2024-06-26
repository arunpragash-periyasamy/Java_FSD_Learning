package com.arunpragash;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello World!");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "hello", new HelloServlet());
        context.addServletMappingDecoded("/*", "hello");
        tomcat.start();
        tomcat.getServer().await();
        System.out.println("Tomcat is running on port 8080");
    }
}
