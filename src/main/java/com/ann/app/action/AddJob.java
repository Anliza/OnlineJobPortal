package com.ann.app.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ann.app.model.Job;
import com.ann.app.view.helper.HtmlComponent;

@WebServlet("addjob")
public class AddJob  extends BaseAction {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       renderPage(req, resp, 3,HtmlComponent.form(Job.class));
    }
    
}
