package com.ann.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/pete")

public class HelloAgain extends GenericServlet{

     @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException,
            IOException {

        PrintWriter print = servletResponse.getWriter();
        print.write("<b>Hello world again!!!</b>");
    }
    
}
