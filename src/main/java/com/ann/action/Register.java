package com.ann.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ann.app.model.entity.User;
import com.ann.database.Database;


@WebServlet("/register")
public class Register extends HttpServlet{
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        PrintWriter print = resp.getWriter();
        print.write(" <!DOCTYPE html>   \n" + //
                "<html>   \n" + //
                "<head>  \n" + //
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n" + //
                "<title> Registration Page </title>  \n" + //
                "<style>   \n" + //
                "\n" + //
                "Body {  \n" + //
                "  font-family: Calibri, Helvetica, sans-serif;  \n" + //
                "  background-color: #096E77; \n" + //
                "}  \n" + //
                "button {   \n" + //
                "       background-color: #9F496E;   \n" + //
                "       width: 100px;  \n" + //
                "        color: #F4F2F3;   \n" + //
                "        padding: 5px;          \n" + //
                "        border: none;   \n" + //
                "        cursor: pointer;   \n" + //
                "         }  \n" + //
                " \n" + //
                " input[type=text], input[type=password] {   \n" + //
                "        width: 100%;   \n" + //
                "        margin: 8px 0;  \n" + //
                "        padding: 12px 20px;   \n" + //
                "        display: inline-block;   \n" + //
                "        border: 2px #F4F2F3;   \n" + //
                "        box-sizing: border-box;   \n" + //
                "    }  \n" + //
                " button:hover {   \n" + //
                "        opacity: 0.7;   \n" + //
                "    }     \n" + //
                "     \n" + //
                " .container {   \n" + //
                "        padding: 20px;   \n" + //
                "        background-color: #E0E5E9; \n" + //
                "        width: 500px;\n" + //
                "        margin: 0 auto; \n" + //
                "        color:#9F496E;\n" + //
                "    }   \n" + //
                "   \n" + //
                "    \n" + //
                "</style>   \n" + //
                "</head>    \n" + //
                "<body>    \n" + //
                "    <center> <h1 style=\"color: #E0E5E9;\"> Register </h1> </center>  \n" + //
                "     \n" + //
                "    <span style=\"font-weight:bold;font-size:13px;\"></span>\n" + //
                "    <form action=\"./register\" method=\"post\">\n" + //
                "\n" + //
                "        <div class=\"container\">\n" + //
                "        <label for=\"username\"><b>Username</b></label>\n" + //
                "        <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required>\n" + //
                "        <label for=\"password\"><b>Password</b></label>\n" + //
                "        <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n" + //
                "        <label for=\"confirmPassword\"><b>Password</b></label>\n" + //
                "        <input type=\"password\" placeholder=\"Confirm Enter Password\" name=\"confirmPassword\" required>\n" + //
                "        <button type=\"reset\">Reset the form!</button><br><br>\n" + //
                "        <button type=\"submit\">Register</button>\n" + //
                "        </div>\n" + //
                "\n" + //
                "    </form> \n" + //
                "\n" + //
                "</body>     \n" + //
                "</html>  ");
    }

     public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Database database = Database.getDbInstance();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        if (password.equals(confirmPassword))
            database.getUsers().add(new User(100L, username, password));

        resp.sendRedirect("./");
    }
}
