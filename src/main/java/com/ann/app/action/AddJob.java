package com.ann.app.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ann.app.model.entity.Job;
import com.ann.app.view.html.AppPage;
import com.ann.app.view.html.HtmlComponent;

@WebServlet("addjob")
public class AddJob  extends BaseAction {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

        new AppPage().renderHtml(req, resp, 3,HtmlComponent.form(Job.class));
    }
    
}
