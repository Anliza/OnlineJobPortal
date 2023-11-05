package com.ann.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login", initParams = {
    @WebInitParam(name = "username", value = "Ann"),
    @WebInitParam(name = "password", value = "Annliza")
})
public class Login extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.sendRedirect("./");
    }

     public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username.equals(getInitParameter("username"))
        && password.equals(getInitParameter("password"))) {
        
            req.setAttribute("homeInfo", "Welcome to your home page!!");
            RequestDispatcher dispatcher = req.getRequestDispatcher("./home");
            dispatcher.forward(req, resp);
          
        }  
        else{
            PrintWriter print =resp.getWriter();
            print.write("<html><body>Invalid login details. <a href= \".\">Login again</a></body></html>");
        }
     }
    
}
