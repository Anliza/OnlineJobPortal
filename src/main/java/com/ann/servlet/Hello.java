package com.ann.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

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
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

        PrintWriter print = resp.getWriter();
        print.print("<b>Hello "+req.getParameter("name")+ "</b><br/>");

        print.print("<b>A Calculator...</b><br/>");

        String numberStr1 =req.getParameter("number1");
        String numberStr2 =req.getParameter("number2");

        BigDecimal number1 = new BigDecimal(numberStr1);
        BigDecimal number2 = new BigDecimal(numberStr2);

        print.print(numberStr1 + "+" + numberStr2 + "=" + number1.add(number2));
        
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
