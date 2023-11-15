package com.ann.app.view.helper;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ann.app.view.css.LoginRegisterCss;

public class LoginPage implements Serializable{
    
    public void renderHtml(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter print = resp.getWriter();
        print.write("<!DOCTYPE html>\n" + //
                "<html>\n" + //
                "\n" + //
                "<head>\n" + //
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" + //
                "    <title> Login Page </title>\n" + //

                    new LoginRegisterCss().getlStyle() +

                "</head>\n" + //
                "\n" + //
                "<body>\n" + //
                "    <center>\n" + //
                "        <h1 style=\"color: #E0E5E9;\"> Login </h1>\n" + //
                "    </center>\n" + //
                "\n" + //
                "    <span style=\"font-weight:bold;font-size:13px;\"></span>\n" + //
                "    <form action=\"./login\" method=\"post\">\n" + //
                "\n" + //
                "        <div class=\"container\">\n" + //
                "            <label>Username : </label>\n" + //
                "            <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required>\n" + //
                "            <label>Password : </label>\n" + //
                "            <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n" + //
                "            <p><button type=\"submit\">Login</button> </p>\n" + //
                "            <right-align> <a style=\"color:#64766A;\" href=\"#\"> Forgot password? </a></right>\n" + //
                "                <left> <a style=\"color:#64766A;\" href=\"./register\"> Register </a></left>\n" + //
                "\n" + //
                "        </div>\n" + //
                "    </form>\n" + //
                "\n" + //
                "</body>\n" + //
                "\n" + //
                "</html>");
    }
}
