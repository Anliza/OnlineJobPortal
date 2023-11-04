package com.ann.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{

     public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter print =resp.getWriter();
        if (username.equals("Ann") && password.equals("Annliza"))
            print.write("Welcome to your job application portal.");
        else
            print.write("<html><body>Invalid login details. <a href= \".\">Login again</a></body></html>");
     }
    
}
