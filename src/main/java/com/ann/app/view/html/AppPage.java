package com.ann.app.view.html;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ann.app.view.css.AppCss;
import com.ann.app.view.toolbar.TopToolbar;

public class AppPage implements Serializable{
    
    public void renderHtml(HttpServletRequest req, HttpServletResponse resp,
       int activeMenu, String content) throws IOException {

        HttpSession session = req.getSession();

        ServletContext ctx = req.getServletContext();

        PrintWriter print = resp.getWriter();

        print.write("<!DOCTYPE html>" +
            "<html>" +

            "<head>" +
                new AppCss().getStyle() +
            "</head>" +

            "<body>" +

            new TopToolbar().menu(activeMenu) +

            "<h3 style=\"color: #E0E5E9;\">" + ctx.getInitParameter("AppName") + "<h3>" +
            //"<br/>&nbsp;<br/>" +
            "<h3 style=\"color: #E0E5E9\";>Welcome: " + session.getAttribute("username") + "</h3><br/>");

        print.write(content);
        print.write("<a style= \" color: pink\"href=\"./logout\">Logout</a>" +
            "</body>" +
            "</html>");


    }
}
