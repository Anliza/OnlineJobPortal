package com.ann.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ann.app.model.entity.User;
import com.ann.app.view.html.RegisterPage;
import com.ann.database.Database;


@WebServlet("/register")
public class Register extends HttpServlet{
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        new RegisterPage().renderHtml(req, resp);
    }

     public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Database database = Database.getDbInstance();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        if (password.equals(confirmPassword))
            database.getUsers().add(new User(100L, username, password));

        resp.sendRedirect("./login");
    }
}
