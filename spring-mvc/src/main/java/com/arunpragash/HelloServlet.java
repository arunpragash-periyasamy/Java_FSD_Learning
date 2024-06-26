package com.arunpragash;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("<h1>Hello, I am in service</h1>");
        System.out.println("Hello, I am in service");
    }
}
