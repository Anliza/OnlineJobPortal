package com.ann.app.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.ann.app.view.html.AppPage;

@WebServlet("services")
public class Services extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId"))) {

            new AppPage().renderHtml(req, resp, 2,
                    "<h2>Services</h2> There will be some content here <br>");

        } else
            resp.sendRedirect("./");
    }
    
}