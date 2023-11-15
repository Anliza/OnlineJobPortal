package com.ann.app.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ann.app.view.helper.AppPage;

@WebServlet("about")
public class About extends BaseAction {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession httpSession = req.getSession();

        new AppPage().renderHtml(req, resp, 1,
            "<h2>About Us </h2> Information on Us <br>");

    }
    
}
