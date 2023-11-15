package com.ann.app.view.helper;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ann.app.view.css.LoginRegisterCss;

public class RegisterPage implements Serializable{
    
    public void renderHtml(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter print = resp.getWriter();
        print.write(" <!DOCTYPE html>   \n" + //
                "<html>   \n" + //
                "<head>  \n" + //
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n" + //
                "<title> Registration Page </title>  \n" + //

                new LoginRegisterCss().getlStyle() +

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
                "        <input type=\"password\" placeholder=\"Confirm Enter Password\" name=\"confirmPassword\" required>\n"
                + //
                "        <button type=\"reset\">Reset the form!</button><br><br>\n" + //
                "        <button type=\"submit\">Register</button>\n" + //
                "        </div>\n" + //
                "\n" + //
                "    </form> \n" + //
                "\n" + //
                "</body>     \n" + //
                "</html>  ");
    }
    
}
