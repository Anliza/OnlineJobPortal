package com.ann.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.ann.app.bean.JobBean;
import com.ann.app.bean.JobBeanI;
import com.ann.app.view.html.AppPage;

@WebServlet("/home")

public class Home extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession httpSession = req.getSession();

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId"))){

        JobBeanI jobBeanEn = new JobBean();

        new AppPage().renderHtml(req, resp, 0,
        "<center><h2 style=\"color: #E0E5E9;\">Available Jobs</h2></center>\n"+ jobBeanEn.jobsAvailable() +
        "<br/ style=\"color: #E0E5E9;\">Add Job<br/><form action=\"./job\" method=\"post\">" +
            "  <label for=\"title\" style=\"color: #E0E5E9;\">Job Title:</label><br>" +
            "  <input type=\"text\" id=\"title\" name=\"title\" ><br>" +
            "  <label for=\"location\" style=\"color: #E0E5E9;\">Location:</label><br>" +
            "  <input type=\"text\" id=\"location\" name=\"location\" ><br>" +
            "  <label for=\"date posted\" style=\"color: #E0E5E9;\">Date Posted:</label><br>" +
            "  <input type=\"text\" id=\"date posted\" name=\"date posted\" ><br><br>" +
            "  <input type=\"submit\" value=\"Submit\">" +
        "</form><br/>");
            
    } else
            resp.sendRedirect("./");
    }
    
}
