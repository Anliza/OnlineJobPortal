package com.ann.app.action;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ann.app.view.html.LandingPage;


@WebServlet( "/")
public class Landing extends BaseAction{
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        new LandingPage().renderHtml(req, resp);
    }
}
