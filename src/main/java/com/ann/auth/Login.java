package com.ann.auth;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.ann.app.model.entity.User;
import com.ann.database.Database;

@WebServlet(urlPatterns = "/login")

public class Login extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        
        HttpSession httpSession = req.getSession();

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId")))
            resp.sendRedirect("./home");
        else{
           // resp.sendRedirect("./login");
           PrintWriter print = resp.getWriter();
           print.write("<!DOCTYPE html>\n" + //
                   "<html>\n" + //
                   "\n" + //
                   "<head>\n" + //
                   "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" + //
                   "    <title> Login Page </title>\n" + //
                   "    <style>\n" + //
                   "        Body {\n" + //
                   "            font-family: Calibri, Helvetica, sans-serif;\n" + //
                   "            background-color: #096E77;\n" + //
                   "        }\n" + //
                   "\n" + //
                   "        button {\n" + //
                   "            background-color: #9F496E;\n" + //
                   "            width: 100px;\n" + //
                   "            color: #F4F2F3;\n" + //
                   "            padding: 5px;\n" + //
                   "            border: none;\n" + //
                   "            cursor: pointer;\n" + //
                   "        }\n" + //
                   "\n" + //
                   "        input[type=text],\n" + //
                   "        input[type=password] {\n" + //
                   "            width: 100%;\n" + //
                   "            margin: 8px 0;\n" + //
                   "            padding: 12px 20px;\n" + //
                   "            display: inline-block;\n" + //
                   "            border: 2px #F4F2F3;\n" + //
                   "            box-sizing: border-box;\n" + //
                   "        }\n" + //
                   "\n" + //
                   "        button:hover {\n" + //
                   "            opacity: 0.7;\n" + //
                   "        }\n" + //
                   "\n" + //
                   "        .container {\n" + //
                   "            padding: 20px;\n" + //
                   "            background-color: #E0E5E9;\n" + //
                   "            width: 500px;\n" + //
                   "            margin: 0 auto;\n" + //
                   "            color: #9F496E;\n" + //
                   "        }\n" + //
                   "    </style>\n" + //
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

     public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        
        String username = req.getParameter("username");
        String password = req.getParameter("password");

            Database database = Database.getDbInstance();
            
            System.out.println("what time was this database created: " + database.getDatabaseCreateAt());

            for (User user : database.getUsers()) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                HttpSession httpSession = req.getSession(true);
          
                httpSession.setAttribute("loggedInId", new Date().getTime() + "");
                httpSession.setAttribute("username", username);

                resp.sendRedirect("./home");

            }
        }   
        PrintWriter print = resp.getWriter();
        print.write("<html><body>Invalid login details <a href=\".\"> Login again </a></body></html>");

 
     }
    
}
