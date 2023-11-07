package com.ann.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( "/")
public class Landing extends HttpServlet{
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        PrintWriter print = resp.getWriter();
        print.write("<!DOCTYPE html>\n" + //
                "<html>\n" + //
                "<head>\n" + //
                "<title>landing page</title>\n" + //
                "<meta charset=\"utf-8\">\n" + //
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" + //
                "<style>\n" + //
                "* {\n" + //
                "  box-sizing: border-box;\n" + //
                "}\n" + //
                "Body {  \n" + //
                "  font-family: Calibri, Helvetica, sans-serif;  \n" + //
                "  background-color: #096E77; \n" + //
                "}  \n" + //
                "\n" + //
                "header {\n" + //
                "  background-color: #096E77;\n" + //
                "  padding: 20px;\n" + //
                "  text-align: center;\n" + //
                "  font-size: 35px;\n" + //
                "  color: #F4F2F3;\n" + //
                "}\n" + //
                "\n" + //
                "nav {\n" + //
                "  float: left;\n" + //
                "  width: 30%;\n" + //
                "  height: 400px; \n" + //
                "  background:  #b56789;\n" + //
                "  padding: 20px;\n" + //
                "  color: #F4F2F3;\n" + //
                "  text-align: center;\n" + //
                "}\n" + //
                "\n" + //
                "nav ul {\n" + //
                "  list-style-type: none;\n" + //
                "  padding: 0;\n" + //
                "}\n" + //
                "\n" + //
                "article {\n" + //
                "  float: left;\n" + //
                "  padding: 0px;\n" + //
                "  width: 70%;\n" + //
                "  background-color: #E0E5E9;\n" + //
                "  height: 400px; \n" + //
                "}\n" + //
                "\n" + //
                "section::after {\n" + //
                "  content: \"\";\n" + //
                "  display: table;\n" + //
                "  clear: both;\n" + //
                "}\n" + //
                "\n" + //
                "footer {\n" + //
                "  background-color:#096E77;\n" + //
                "  padding: 10px;\n" + //
                "  text-align: center;\n" + //
                "  color: #F4F2F3;\n" + //
                "  font-size: 15px;\n" + //
                "}\n" + //
                "\n" + //
                "@media (max-width: 600px) {\n" + //
                "  nav, article {\n" + //
                "    width: 100%;\n" + //
                "    height: auto;\n" + //
                "  }\n" + //
                "}\n" + //
                "</style>\n" + //
                "</head>\n" + //
                "<body>\n" + //
                "\n" + //
                "<header>\n" + //
                "  <h2>Find Your Dream Job</h2>\n" + //
                "  <p style =\"font-size: 25px;\">Start the journey to your dream job with a click of a button.</p>\n" + //
                "</header>\n" + //
                "\n" + //
                "<section>\n" + //
                "  <nav>\n" + //
                "    <ul>\n" + //
                "      <li><b><a href=\"./login\">Login</a></b></li><br><br>\n" + //
                "      <li><b><a href=\"./register\">Signup</a></b></li>\n" + //
                "    </ul>\n" + //
                "  </nav>\n" + //
                "  \n" + //
                "  <article>\n" + //
                "    <img src =\"https://jobs.washingtonpost.com/getasset/e29b5986-848f-4fe7-8915-fdbb3a300096/\" alt =\"Image of desk with job alication documents, a note book, glasses and part of computer keyboard.\"width=\"900\" height=\"400\">\n" + //
                "  </article>\n" + //
                "</section>\n" + //
                "\n" + //
                "<footer>\n" + //
                "  <p><em>Choose a job you love, and you will never have to work a day in your life.</em></p>\n" + //
                "</footer>\n" + //
                "\n" + //
                "");
    }
}
