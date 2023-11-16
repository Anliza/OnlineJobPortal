package com.ann.app.view.helper;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ann.app.view.css.LandingCss;

public class LandingPage implements Serializable{
    
    public void renderHtml(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter print = resp.getWriter();
        print.write("<!DOCTYPE html>\n" + //
        "<html>\n" + //
        "<head>\n" + //
        "<title>landing page</title>\n" + //
        "<meta charset=\"utf-8\">\n" + //
        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" + //
        
        new LandingCss().getLandingStyle() +

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
        "      <li><b><a href=\"./register\">Signup</a></b></li><br><br\n" + //
        "      <li><b><a href=\"./about\">About Us</a></b></li><br><br\n" + //
        "      <li><b><a href=\"./help\">Help Center</a></b></li><br><br\n" + //
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
        "</footer>\n" 
        );
    }
}
