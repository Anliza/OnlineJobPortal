package com.ann.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.ann.app.view.html.AppPage;

@WebServlet("about")
public class About extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession httpSession = req.getSession();

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId"))) {

            new AppPage().renderHtml(req, resp, 1,
                    "<h2>About Us </h2> Information on Us");

        } else
            resp.sendRedirect("./");
    }
    
}
