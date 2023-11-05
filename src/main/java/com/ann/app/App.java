package com.ann.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/app")

public class App extends HttpServlet{

     public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String homeInfo = (String) req.getAttribute("homeInfo");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter print = resp.getWriter();
        print.write("<html><body>This is APP servlet "  + homeInfo  +  " username is : " + username
                + " & password is: " + password + " </body></html>");

    }
    
}
