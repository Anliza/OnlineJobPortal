package com.ann.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/nate")

public class Hello implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        System.out.println("The hello servlet has been created");

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        PrintWriter print = servletResponse.getWriter();
        print.print("<b>Hello world!</b>");
        
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

        System.out.println("Shutting down hello class!");
        
    }
    
    
}
